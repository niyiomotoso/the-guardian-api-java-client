package the.guardian.api.entity;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import the.guardian.api.http.AbstractResponse;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * Abstract base class for entities interacting with The Guardian API.
 */
public abstract class ApiEntity {
    protected String query = "";
    protected String baseUrl = "";
    protected String format = "";

    /**
     * Retrieves the base URL for API requests.
     *
     * @return The base URL.
     */
    public String getBaseUrl() {
        return this.baseUrl;
    }

    /**
     * Sets the base URL for API requests.
     *
     * @param data The base URL.
     */
    public void setBaseUrl(String data) {
        this.baseUrl = data;
    }

    /**
     * Retrieves the format for API responses.
     *
     * @return The response format.
     */
    public String getFormat() {
        return this.format;
    }

    /**
     * Sets the format for API responses.
     *
     * @param data The response format.
     */
    public void setFormat(String data) {
        this.format = data;
    }

    /**
     * Appends an attribute to the base URL.
     *
     * @param attributeName  The name of the attribute to append.
     * @param attributeValue The value of the attribute to append.
     * @return The updated ApiEntity instance.
     * @throws UnsupportedEncodingException If encoding the attribute value fails.
     */
    public ApiEntity appendToBaseUrl(String attributeName, String attributeValue) throws UnsupportedEncodingException {
        if (!attributeValue.equals("")) {
            String encodedValue = URLEncoder.encode(attributeValue, "UTF-8");
            String url = "&" + attributeName + "=" + encodedValue;
            this.baseUrl += url;
        }
        return this;
    }

    /**
     * Builds the complete URL for API requests.
     *
     * @return The complete URL.
     * @throws UnsupportedEncodingException If encoding the URL components fails.
     */
    public abstract String buildUrl() throws UnsupportedEncodingException;

    /**
     * Fetches data from the API and returns the response.
     *
     * @return The API response as an AbstractResponse object.
     * @throws UnsupportedEncodingException If encoding the URL components fails.
     * @throws UnirestException            If a Unirest HTTP request exception occurs.
     */
    public abstract AbstractResponse fetch() throws UnsupportedEncodingException, UnirestException;

    /**
     * Constructs an ApiEntity instance with the provided base URL.
     *
     * @param _baseUrl The base URL for API requests.
     */
    public ApiEntity(String _baseUrl) {
        super();
        this.format = "json";
        this.baseUrl = _baseUrl;
    }

    static {
        Unirest.setObjectMapper(new ObjectMapper() {
            private final com.fasterxml.jackson.databind.ObjectMapper jacksonObjectMapper =
                    new com.fasterxml.jackson.databind.ObjectMapper();

            public <T> T readValue(String value, Class<T> valueType) {
                try {
                    return jacksonObjectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
                            .readValue(value, valueType);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            public String writeValue(Object value) {
                try {
                    return jacksonObjectMapper.writeValueAsString(value);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}
