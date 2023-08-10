package the.guardian.api.http.editions;

/**
 * Represents an edition item from The Guardian API.
 */
public class EditionItem {

    private String id;
    private String edition;
    private String webTitle;
    private String webUrl;
    private String apiUrl;
    private String path;

    /**
     * Retrieves the ID of the edition item.
     *
     * @return The ID.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Sets the ID of the edition item.
     *
     * @param data The ID.
     */
    public void setId(String data) {
        this.id = data;
    }

    /**
     * Retrieves the edition of the item.
     *
     * @return The edition.
     */
    public String getEdition() {
        return this.edition;
    }

    /**
     * Sets the edition of the item.
     *
     * @param data The edition.
     */
    public void setEdition(String data) {
        this.edition = data;
    }

    /**
     * Retrieves the web title of the edition item.
     *
     * @return The web title.
     */
    public String getWebTitle() {
        return this.webTitle;
    }

    /**
     * Sets the web title of the edition item.
     *
     * @param data The web title.
     */
    public void setWebTitle(String data) {
        this.webTitle = data;
    }

    /**
     * Retrieves the web URL of the edition item.
     *
     * @return The web URL.
     */
    public String getWebUrl() {
        return this.webUrl;
    }

    /**
     * Sets the web URL of the edition item.
     *
     * @param data The web URL.
     */
    public void setWebUrl(String data) {
        this.webUrl = data;
    }

    /**
     * Retrieves the API URL of the edition item.
     *
     * @return The API URL.
     */
    public String getApiUrl() {
        return this.apiUrl;
    }

    /**
     * Sets the API URL of the edition item.
     *
     * @param data The API URL.
     */
    public void setApiUrl(String data) {
        this.apiUrl = data;
    }

    /**
     * Retrieves the path of the edition item.
     *
     * @return The path.
     */
    public String getPath() {
        return this.path;
    }

    /**
     * Sets the path of the edition item.
     *
     * @param data The path.
     */
    public void setPath(String data) {
        this.path = data;
    }

    /**
     * Returns a string representation of the EditionItem object.
     *
     * @return The string representation.
     */
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
