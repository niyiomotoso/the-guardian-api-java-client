package the.guardian.api.entity;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.HttpRequest;
import the.guardian.api.http.AbstractResponse;
import the.guardian.api.http.sections.SectionsResponseWrapper;

import java.io.UnsupportedEncodingException;

/**
 * Class Sections
 * The sections guardian API entity
 */

public class Sections extends ApiEntity {
    
    public Sections setQuery(String query) {
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
        HttpRequest request = Unirest.get(url).header("accept", "application/json");
        HttpResponse<SectionsResponseWrapper> response = request.asObject(SectionsResponseWrapper.class);
        
        return response.getBody().getResponse();
    }

    public Sections(String _apiUrl) {
        super(_apiUrl);
    }
}
