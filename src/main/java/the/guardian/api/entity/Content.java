package the.guardian.api.entity;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.HttpRequest;
import the.guardian.api.http.AbstractResponse;
import the.guardian.api.http.content.ContentResponseWrapper;

import java.io.UnsupportedEncodingException;

/**
 * Class Content
 * The content guardian API entity
 */

public class Content extends ContentApiEntity {
    private String queryFields = "";

    public Content(String _apiUrl) {

        super(_apiUrl);
        this.queryFields = "";
    }
    
    public String getQueryFields() {
        return this.queryFields;
    }

    public String getQuery() {
        return this.query;
    }

    
    public Content setQuery(String query) {
        this.query = query;
        
        return this;
    }

    
    public Content setQueryFields(String queryFields) {
        this.queryFields = queryFields;
        
        return this;
    }

    public void buildUrl() throws UnsupportedEncodingException {
        super.buildUrl();
        this.appendToBaseUrl("q", this.getQuery())
                .appendToBaseUrl("query-fields", this.getQueryFields());
    }
    
    public AbstractResponse fetch() throws UnsupportedEncodingException, UnirestException {
        this.buildUrl();
        String url = this.getBaseUrl();
        System.out.println("urlx "+url);
        HttpRequest request = Unirest.get(url).header("accept", "application/json");
        HttpResponse<ContentResponseWrapper> response = request.asObject(ContentResponseWrapper.class);
        
        return response.getBody().getResponse();
    }
}
