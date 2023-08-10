package the.guardian.api.http.sections;

import java.util.Arrays;

/**
 * Represents a section item in The Guardian API.
 */
public class SectionItem {

    private String id;

    private String webTitle;

    private String webUrl;

    private String apiUrl;

    private SectionEditionItem[] editions;

    /**
     * Retrieves the ID of the section item.
     *
     * @return The ID.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Sets the ID of the section item.
     *
     * @param data The ID to set.
     */
    public void setId(String data) {
        this.id = data;
    }

    /**
     * Retrieves the web title of the section item.
     *
     * @return The web title.
     */
    public String getWebTitle() {
        return this.webTitle;
    }

    /**
     * Sets the web title of the section item.
     *
     * @param data The web title to set.
     */
    public void setWebTitle(String data) {
        this.webTitle = data;
    }

    /**
     * Retrieves the web URL of the section item.
     *
     * @return The web URL.
     */
    public String getWebUrl() {
        return this.webUrl;
    }

    /**
     * Sets the web URL of the section item.
     *
     * @param data The web URL to set.
     */
    public void setWebUrl(String data) {
        this.webUrl = data;
    }

    /**
     * Retrieves the API URL of the section item.
     *
     * @return The API URL.
     */
    public String getApiUrl() {
        return this.apiUrl;
    }

    /**
     * Sets the API URL of the section item.
     *
     * @param data The API URL to set.
     */
    public void setApiUrl(String data) {
        this.apiUrl = data;
    }

    /**
     * Retrieves the editions associated with the section item.
     *
     * @return The editions.
     */
    public SectionEditionItem[] getEditions() {
        return this.editions;
    }

    /**
     * Sets the editions associated with the section item.
     *
     * @param data The editions to set.
     */
    public void setEditions(SectionEditionItem[] data) {
        this.editions = data;
    }

    /**
     * Returns a string representation of the SectionItem object.
     *
     * @return The string representation.
     */
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
