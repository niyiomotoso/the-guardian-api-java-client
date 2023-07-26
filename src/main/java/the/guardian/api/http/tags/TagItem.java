package the.guardian.api.http.tags;

public class TagItem {
    private String id;
    
    private String type;
    
    private String webTitle;
    
    private String webUrl;
    
    private String apiUrl;
    
    private String sectionId;
    
    private String sectionName;

    
    public String getId() {
        return this.id;
    }

    public void setId(String data) {
        this.id = data;
    }

    
    public String getType() {
        return this.type;
    }

    public void setType(String data) {
        this.type = data;
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

    
    public String getSectionId() {
        return this.sectionId;
    }

    public void setSectionId(String data) {
        this.sectionId = data;
    }

    
    public String getSectionName() {
        return this.sectionName;
    }

    public void setSectionName(String data) {
        this.sectionName = data;
    }

    @Override
    public String toString() {
        return "TagItem{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", webTitle='" + webTitle + '\'' +
                ", webUrl='" + webUrl + '\'' +
                ", apiUrl='" + apiUrl + '\'' +
                ", sectionId='" + sectionId + '\'' +
                ", sectionName='" + sectionName + '\'' +
                '}';
    }
}
