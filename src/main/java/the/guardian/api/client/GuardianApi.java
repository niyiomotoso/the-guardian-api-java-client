package the.guardian.api.client;

import the.guardian.api.config.UrlMap;
import the.guardian.api.entity.*;

public class GuardianApi{
    private String apiKey;

    public GuardianApi(String _apiKey) {
        validateApiKey(_apiKey);
        this.apiKey = _apiKey;
    }

    /**
     * make sure the api key is valid
     */
    private String validateApiKey(String apiKey) {
        if (apiKey.length() < 4) {
            throw new IllegalArgumentException("API key "+ apiKey +" is too short, and thus invalid.");
        }

        return apiKey;
    }
    
    public Content content() {
        String apiUrl =  new UrlMap().CONTENT + "?api-key=" + this.apiKey;
        return new Content(apiUrl);
    }

    
    public Tags tags() {
        String apiUrl =  new UrlMap().TAGS + "?api-key=" + this.apiKey;
        return new Tags(apiUrl);
    }

    
    public Sections sections() {
        String apiUrl =  new UrlMap().SECTIONS+ "?api-key=" + this.apiKey;
        return new Sections(apiUrl);
    }

    
    public Editions editions() {
        String apiUrl =  new UrlMap().EDITIONS + "?api-key=" + this.apiKey;
        return new Editions(apiUrl);
    }

    
    public SingleItem singleItem() {
        String apiUrl =  new UrlMap().BASE;
        return new SingleItem(apiUrl, this.apiKey);
    }
}
