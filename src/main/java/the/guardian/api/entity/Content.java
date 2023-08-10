package the.guardian.api.entity;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.HttpRequest;
import the.guardian.api.http.AbstractResponse;
import the.guardian.api.http.content.ContentResponse;
import the.guardian.api.http.content.ContentResponseWrapper;

import java.io.UnsupportedEncodingException;

/**
 * Represents a Content entity for interacting with content-related operations of The Guardian API.
 */
public class Content extends ContentApiEntity {
    private String queryFields = "";

    /**
     * Constructs a Content instance with the provided API URL.
     *
     * @param _apiUrl The API URL for content-related operations.
     */
    public Content(String _apiUrl) {
        super(_apiUrl);
        this.queryFields = "";
    }

    /**
     * Retrieves the query fields.
     *
     * @return The query fields.
     */
    public String getQueryFields() {
        return this.queryFields;
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
     * Sets the query.
     *
     * @param query The query.
     * @return The updated Content instance.
     */
    public Content setQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * Sets the query fields.
     *
     * @param queryFields The query fields.
     * @return The updated Content instance.
     */
    public Content setQueryFields(String queryFields) {
        this.queryFields = queryFields;
        return this;
    }

    /**
     * Builds the URL for API requests.
     *
     * @return The built URL.
     * @throws UnsupportedEncodingException If encoding URL components fails.
     */
    public String buildUrl() throws UnsupportedEncodingException {
        super.buildUrl();
        this.appendToBaseUrl("q", this.getQuery())
                .appendToBaseUrl("query-fields", this.getQueryFields());

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
        HttpResponse<ContentResponseWrapper> response = request.asObject(ContentResponseWrapper.class);

        return response.getBody().getResponse();
    }
}
