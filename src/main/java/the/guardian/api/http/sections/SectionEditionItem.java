package the.guardian.api.http.sections;

/**
 * Represents an edition item associated with a section in The Guardian API.
 */
public class SectionEditionItem {

    private String id;

    private String webTitle;

    private String webUrl;

    private String apiUrl;

    private String code;

    /**
     * Retrieves the ID of the section edition item.
     *
     * @return The ID.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Sets the ID of the section edition item.
     *
     * @param data The ID to set.
     */
    public void setId(String data) {
        this.id = data;
    }

    /**
     * Retrieves the web title of the section edition item.
     *
     * @return The web title.
     */
    public String getWebTitle() {
        return this.webTitle;
    }

    /**
     * Sets the web title of the section edition item.
     *
     * @param data The web title to set.
     */
    public void setWebTitle(String data) {
        this.webTitle = data;
    }

    /**
     * Retrieves the web URL of the section edition item.
     *
     * @return The web URL.
     */
    public String getWebUrl() {
        return this.webUrl;
    }

    /**
     * Sets the web URL of the section edition item.
     *
     * @param data The web URL to set.
     */
    public void setWebUrl(String data) {
        this.webUrl = data;
    }

    /**
     * Retrieves the API URL of the section edition item.
     *
     * @return The API URL.
     */
    public String getApiUrl() {
        return this.apiUrl;
    }

    /**
     * Sets the API URL of the section edition item.
     *
     * @param data The API URL to set.
     */
    public void setApiUrl(String data) {
        this.apiUrl = data;
    }

    /**
     * Retrieves the code associated with the section edition item.
     *
     * @return The code.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Sets the code associated with the section edition item.
     *
     * @param data The code to set.
     */
    public void setCode(String data) {
        this.code = data;
    }

    /**
     * Returns a string representation of the SectionEditionItem object.
     *
     * @return The string representation.
     */
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
