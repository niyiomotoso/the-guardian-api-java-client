package the.guardian.api.entity;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.HttpRequest;
import the.guardian.api.http.AbstractResponse;
import the.guardian.api.http.tags.TagsResponseWrapper;

import java.io.UnsupportedEncodingException;

/**
 *
 */
public class Tags extends PageAndReferenceApiEntity {
    
    private String webTitle = "";
    
    private String type = "";

    
    public String getWebTitle() {
        return this.webTitle;
    }

    public String getQuery() {
        return this.query;
    }

    public String getType() {
        return this.type;
    }
    
    public Tags setWebTitle(String webTitle) {
        this.webTitle = webTitle;
        
        return this;
    }

    
    public Tags setType(String type) {
        this.type = type;
        
        return this;
    }

    
    public Tags setQuery(String query) {
        this.query = query;

        return this;
    }

    public void buildUrl() throws UnsupportedEncodingException {
        this.appendToBaseUrl("page", String.valueOf(this.getPage()))
                .appendToBaseUrl("page-size", String.valueOf(this.getPageSize()))
                .appendToBaseUrl("q", this.getQuery())
                .appendToBaseUrl("web-title", this.webTitle)
                .appendToBaseUrl("type", this.type)
                .appendToBaseUrl("section", this.getSection())
                .appendToBaseUrl("reference", this.getReference())
                .appendToBaseUrl("reference-type", this.getReferenceType())
                .appendToBaseUrl("show-references", this.getShowReferences());
    }

    public AbstractResponse fetch() throws UnsupportedEncodingException, UnirestException {
        this.buildUrl();
        String url = this.getBaseUrl();
        HttpRequest request = Unirest.get(url).header("accept", "application/json");
        HttpResponse<TagsResponseWrapper> response = request.asObject(TagsResponseWrapper.class);

        return response.getBody().getResponse();
    }

    public Tags(String _apiUrl) {
        super(_apiUrl);
    }
}
