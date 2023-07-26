package the.guardian.api.http.sections;

public class SectionEditionItem {
    
    private String id;
    
    private String webTitle;
    
    private String webUrl;
    
    private String apiUrl;
    
    private String code;

    
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

    
    public String getCode() {
        return this.code;
    }

    public void setCode(String data) {
        this.code = data;
    }

    @Override
    public String toString() {
        return "SectionEditionItem{" +
                "id='" + id + '\'' +
                ", webTitle='" + webTitle + '\'' +
                ", webUrl='" + webUrl + '\'' +
                ", apiUrl='" + apiUrl + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
