package the.guardian.api.entity;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.HttpRequest;
import the.guardian.api.http.AbstractResponse;
import the.guardian.api.http.sections.SectionsResponseWrapper;

import java.io.UnsupportedEncodingException;

/**
 * Class Sections
 * The sections guardian API entity
 */
public class Sections extends ApiEntity {

    /**
     * Sets the query parameter for the API request.
     *
     * @param query The query parameter value to set.
     * @return The updated Sections instance.
     */
    public Sections setQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * Retrieves the query parameter value.
     *
     * @return The query parameter value.
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * Builds the complete URL for API requests.
     *
     * @return The complete URL.
     * @throws UnsupportedEncodingException If encoding the URL components fails.
     */
    public String buildUrl() throws UnsupportedEncodingException {
        this.appendToBaseUrl("q", this.getQuery());
        return this.baseUrl;
    }

    /**
     * Fetches data from the API and returns the response.
     *
     * @return The API response as an AbstractResponse object.
     * @throws UnsupportedEncodingException If encoding the URL components fails.
     * @throws UnirestException            If a Unirest HTTP request exception occurs.
     */
    public AbstractResponse fetch() throws UnsupportedEncodingException, UnirestException {
        this.buildUrl();
        String url = this.getBaseUrl();
        HttpRequest request = Unirest.get(url).header("accept", "application/json");
        HttpResponse<SectionsResponseWrapper> response = request.asObject(SectionsResponseWrapper.class);

        return response.getBody().getResponse();
    }

    /**
     * Constructs a Sections instance with the provided API URL.
     *
     * @param _apiUrl The API URL for sections requests.
     */
    public Sections(String _apiUrl) {
        super(_apiUrl);
    }
}
