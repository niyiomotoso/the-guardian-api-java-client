package the.guardian.api.http.editions;

public class EditionItem {

    private String id;

    private String edition;

    private String webTitle;

    private String webUrl;

    private String apiUrl;

    private String path;


    public String getId() {
        return this.id;
    }

    public void setId(String data) {
        this.id = data;
    }


    public String getEdition() {
        return this.edition;
    }

    public void setEdition(String data) {
        this.edition = data;
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


    public String getPath() {
        return this.path;
    }

    public void setPath(String data) {
        this.path = data;
    }

    @Override
    public String toString() {
        return "EditionItem{" +
                "id='" + id + '\'' +
                ", edition='" + edition + '\'' +
                ", webTitle='" + webTitle + '\'' +
                ", webUrl='" + webUrl + '\'' +
                ", apiUrl='" + apiUrl + '\'' +
                ", path='" + path + '\'' +
                '}';
    }
}

