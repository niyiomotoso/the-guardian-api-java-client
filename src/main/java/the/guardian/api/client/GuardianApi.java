package the.guardian.api.client;

import the.guardian.api.config.UrlMap;
import the.guardian.api.entity.*;

/**
 *
 */
public class GuardianApi{
    private String apiKey;

    
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
        String var10003 = this.apiKey;

        return new SingleItem(apiUrl, var10003);
    }

    public GuardianApi(String _apiKey) {
        super();
        this.apiKey = _apiKey;
    }
}
