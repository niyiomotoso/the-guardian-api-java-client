package the.guardian.api.client;

import the.guardian.api.config.UrlMap;
import the.guardian.api.entity.*;

/**
 * Represents a client for interacting with The Guardian API.
 */
public class GuardianApi {
    private String apiKey;

    /**
     * Constructs a GuardianApi instance with the provided API key.
     *
     * @param _apiKey The API key to be used for authentication.
     * @throws IllegalArgumentException If the provided API key is too short.
     */
    public GuardianApi(String _apiKey) {
        validateApiKey(_apiKey);
        this.apiKey = _apiKey;
    }

    /**
     * Validates whether the provided API key is valid.
     *
     * @param apiKey The API key to be validated.
     * @throws IllegalArgumentException If the provided API key is too short.
     */
    private void validateApiKey(String apiKey) {
        if (apiKey.length() < 4) {
            throw new IllegalArgumentException("API key " + apiKey + " is too short, and thus invalid.");
        }
    }

    /**
     * Returns a Content instance for interacting with content-related operations of the API.
     *
     * @return A Content instance.
     */
    public Content content() {
        String apiUrl = new UrlMap().CONTENT + "?api-key=" + this.apiKey;
        return new Content(apiUrl);
    }

    /**
     * Returns a Tags instance for interacting with tags-related operations of the API.
     *
     * @return A Tags instance.
     */
    public Tags tags() {
        String apiUrl = new UrlMap().TAGS + "?api-key=" + this.apiKey;
        return new Tags(apiUrl);
    }

    /**
     * Returns a Sections instance for interacting with sections-related operations of the API.
     *
     * @return A Sections instance.
     */
    public Sections sections() {
        String apiUrl = new UrlMap().SECTIONS + "?api-key=" + this.apiKey;
        return new Sections(apiUrl);
    }

    /**
     * Returns an Editions instance for interacting with editions-related operations of the API.
     *
     * @return An Editions instance.
     */
    public Editions editions() {
        String apiUrl = new UrlMap().EDITIONS + "?api-key=" + this.apiKey;
        return new Editions(apiUrl);
    }

    /**
     * Returns a SingleItem instance for interacting with single item-related operations of the API.
     *
     * @return A SingleItem instance.
     */
    public SingleItem singleItem() {
        String apiUrl = new UrlMap().BASE;
        return new SingleItem(apiUrl, this.apiKey);
    }
}
