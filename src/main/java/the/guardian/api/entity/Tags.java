package the.guardian.api.entity;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.HttpRequest;
import the.guardian.api.http.AbstractResponse;
import the.guardian.api.http.tags.TagsResponse;
import the.guardian.api.http.tags.TagsResponseWrapper;

import java.io.UnsupportedEncodingException;

/**
 * Represents a Tags entity for interacting with tags-related operations of The Guardian API.
 */
public class Tags extends PageAndReferenceApiEntity {

    private String webTitle = "";
    private String type = "";

    /**
     * Retrieves the web title.
     *
     * @return The web title.
     */
    public String getWebTitle() {
        return this.webTitle;
    }

    /**
     * Retrieves the query.
     *
     * @return The query.
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * Retrieves the type.
     *
     * @return The type.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Sets the web title.
     *
     * @param webTitle The web title.
     * @return The updated Tags instance.
     */
    public Tags setWebTitle(String webTitle) {
        this.webTitle = webTitle;
        return this;
    }

    /**
     * Sets the type.
     *
     * @param type The type.
     * @return The updated Tags instance.
     */
    public Tags setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Sets the query.
     *
     * @param query The query.
     * @return The updated Tags instance.
     */
    public Tags setQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * Builds the URL for API requests.
     *
     * @return The built URL.
     * @throws UnsupportedEncodingException If encoding URL components fails.
     */
    public String buildUrl() throws UnsupportedEncodingException {
        this.appendToBaseUrl("page", String.valueOf(this.getPage()))
                .appendToBaseUrl("page-size", String.valueOf(this.getPageSize()))
                .appendToBaseUrl("q", this.getQuery())
                .appendToBaseUrl("web-title", this.webTitle)
                .appendToBaseUrl("type", this.type)
                .appendToBaseUrl("section", this.getSection())
                .appendToBaseUrl("reference", this.getReference())
                .appendToBaseUrl("reference-type", this.getReferenceType())
                .appendToBaseUrl("show-references", this.getShowReferences());

        return this.baseUrl;
    }

    /**
     * Fetches data from the API and returns the response.
     *
     * @return The API response as an AbstractResponse object.
     * @throws UnsupportedEncodingException If encoding URL components fails.
     * @throws UnirestException            If a Unirest HTTP request exception occurs.
     */
    public AbstractResponse fetch() throws UnsupportedEncodingException, UnirestException {
        this.buildUrl();
        String url = this.getBaseUrl();
        HttpRequest request = Unirest.get(url).header("accept", "application/json");
        HttpResponse<TagsResponseWrapper> response = request.asObject(TagsResponseWrapper.class);
        return response.getBody().getResponse();
    }

    /**
     * Constructs a Tags instance with the provided API URL.
     *
     * @param _apiUrl The API URL for tags-related operations.
     */
    public Tags(String _apiUrl) {
        super(_apiUrl);
    }
}
