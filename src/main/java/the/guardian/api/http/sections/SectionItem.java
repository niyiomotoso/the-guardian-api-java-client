package the.guardian.api.http.sections;

import java.util.Arrays;

public class SectionItem {
    
    private String id;
    
    private String webTitle;
    
    private String webUrl;
    
    private String apiUrl;
    
    private SectionEditionItem[] editions;

    
    public String getId() {
        return this.id;
    }

    public void setId(String data) {
        this.id = data;
    }

    
    public String getWebTitle() {
        return this.webTitle;
    }

    public void setWebTitle(String data) {
        this.webTitle = data;
    }

    
    public String getWebUrl() {
        return this.webUrl;
    }

    public void setWebUrl(String data) {
        this.webUrl = data;
    }

    
    public String getApiUrl() {
        return this.apiUrl;
    }

    public void setApiUrl(String data) {
        this.apiUrl = data;
    }

    
    public SectionEditionItem[] getEditions() {
        return this.editions;
    }

    public void setEditions( SectionEditionItem[] data) {
        this.editions = data;
    }

    @Override
    public String toString() {
        return "SectionItem{" +
                "id='" + id + '\'' +
                ", webTitle='" + webTitle + '\'' +
                ", webUrl='" + webUrl + '\'' +
                ", apiUrl='" + apiUrl + '\'' +
                ", editions=" + Arrays.toString(editions) +
                '}';
    }
}
