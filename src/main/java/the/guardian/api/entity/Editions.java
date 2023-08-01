package the.guardian.api.entity;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.GetRequest;
import the.guardian.api.http.AbstractResponse;
import the.guardian.api.http.editions.EditionsResponseWrapper;

import java.io.UnsupportedEncodingException;

/**
 * Class Editions
 *
 * The editions guardian API entity
 */

public class Editions extends ApiEntity {
    public Editions(String _apiUrl) {
        super(_apiUrl);
    }
    public Editions setQuery(String query) {
        this.query = query;
        
        return this;
    }

    public String getQuery() {
        return this.query;
    }

    public String buildUrl() throws UnsupportedEncodingException {
        this.appendToBaseUrl("q", this.getQuery());

        return this.baseUrl;
    }
    
    public AbstractResponse fetch() throws UnsupportedEncodingException, UnirestException {
        this.buildUrl();
        String url = this.getBaseUrl();
        GetRequest request = Unirest.get(url).header("accept", "application/json");
        HttpResponse<EditionsResponseWrapper> response = request.asObject(EditionsResponseWrapper.class);
     
        return response.getBody().getResponse();
    }
}