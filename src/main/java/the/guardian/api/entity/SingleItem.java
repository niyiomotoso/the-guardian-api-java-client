package the.guardian.api.entity;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.HttpRequest;
import the.guardian.api.http.AbstractResponse;
import the.guardian.api.http.singleItem.SingleItemResponseWrapper;

import java.io.UnsupportedEncodingException;

public class SingleItem extends ContentApiEntity {
    
    private String id = "";
    
    private String showStoryPackage = "";
    
    private String showEditorsPicks = "";
    
    private String showMostViewed = "";
    
    private String showRelated = "";
    
    private String apiKey = "";

    
    public String getId() {
        return this.id;
    }
    
    public String getShowStoryPackage() {
        return this.showStoryPackage;
    }

    
    public String getShowEditorsPicks() {
        return this.showEditorsPicks;
    }
    
    public String getShowMostViewed() {
        return this.showMostViewed;
    }
    
    public String getShowRelated() {
        return this.showRelated;
    }
    
    public String getApiKey() {
        return this.apiKey;
    }
    
    public SingleItem setId(String id) {
        this.id = id;
        
        return this;
    }

    
    public SingleItem setShowStoryPackage(boolean showStoryPackage) {
        if (showStoryPackage) {
            this.showStoryPackage = "true";
        } else {
            this.showStoryPackage = "false";
        }

        return this;
    }

    
    public SingleItem setShowEditorsPicks(boolean showEditorsPicks) {
        if (showEditorsPicks) {
            this.showEditorsPicks = "true";
        } else {
            this.showEditorsPicks = "false";
        }

        return this;
    }

    
    public SingleItem setShowMostViewed(boolean showMostViewed) {
        if (showMostViewed) {
            this.showMostViewed = "true";
        } else {
            this.showMostViewed = "false";
        }

        return this;
    }

    
    public SingleItem setShowRelated(boolean showRelated) {
        if (showRelated) {
            this.showRelated = "true";
        } else {
            this.showRelated = "false";
        }

        return this;
    }

    public void buildUrl() throws UnsupportedEncodingException {
        this.setBaseUrl(this.getBaseUrl() + this.id + "?api-key=" + this.apiKey);
        super.buildUrl();
        this.appendToBaseUrl("show-story-package", this.showStoryPackage).appendToBaseUrl("show-editors-picks", this.showEditorsPicks).appendToBaseUrl("show-most-viewed", this.showMostViewed).appendToBaseUrl("show-related", this.showRelated);
    }
    
    public AbstractResponse fetch() throws UnsupportedEncodingException, UnirestException {
        this.buildUrl();
        String url = this.getBaseUrl();
        HttpRequest request = Unirest.get(url).header("accept", "application/json");
        HttpResponse<SingleItemResponseWrapper> response = request.asObject(SingleItemResponseWrapper.class);
        
        return response.getBody().getResponse();
    }

    public SingleItem(String _baseUrl,  String _apiKey) {
        super(_baseUrl);
        this.apiKey = _apiKey;
    }
}
