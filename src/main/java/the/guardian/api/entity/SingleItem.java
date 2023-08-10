package the.guardian.api.entity;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.HttpRequest;
import the.guardian.api.http.AbstractResponse;
import the.guardian.api.http.singleItem.SingleItemResponseWrapper;

import java.io.UnsupportedEncodingException;

/**
 * Class SingleItem
 * Represents the SingleItem guardian API entity
 */
public class SingleItem extends ContentApiEntity {

    private String id = "";
    private String showStoryPackage = "";
    private String showEditorsPicks = "";
    private String showMostViewed = "";
    private String showRelated = "";
    private String apiKey = "";

    /**
     * Get the ID of the single item.
     *
     * @return The ID of the single item.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get whether to show the story package.
     *
     * @return True if showing the story package, false otherwise.
     */
    public String getShowStoryPackage() {
        return this.showStoryPackage;
    }

    /**
     * Get whether to show editor's picks.
     *
     * @return True if showing editor's picks, false otherwise.
     */
    public String getShowEditorsPicks() {
        return this.showEditorsPicks;
    }

    /**
     * Get whether to show most viewed items.
     *
     * @return True if showing most viewed items, false otherwise.
     */
    public String getShowMostViewed() {
        return this.showMostViewed;
    }

    /**
     * Get whether to show related items.
     *
     * @return True if showing related items, false otherwise.
     */
    public String getShowRelated() {
        return this.showRelated;
    }

    /**
     * Get the API key used for authentication.
     *
     * @return The API key.
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * Set the ID of the single item.
     *
     * @param id The ID of the single item.
     * @return The updated SingleItem instance.
     */
    public SingleItem setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Set whether to show the story package.
     *
     * @param showStoryPackage True to show the story package, false otherwise.
     * @return The updated SingleItem instance.
     */
    public SingleItem setShowStoryPackage(boolean showStoryPackage) {
        if (showStoryPackage) {
            this.showStoryPackage = "true";
        } else {
            this.showStoryPackage = "false";
        }
        return this;
    }

    /**
     * Set whether to show editor's picks.
     *
     * @param showEditorsPicks True to show editor's picks, false otherwise.
     * @return The updated SingleItem instance.
     */
    public SingleItem setShowEditorsPicks(boolean showEditorsPicks) {
        if (showEditorsPicks) {
            this.showEditorsPicks = "true";
        } else {
            this.showEditorsPicks = "false";
        }
        return this;
    }

    /**
     * Set whether to show most viewed items.
     *
     * @param showMostViewed True to show most viewed items, false otherwise.
     * @return The updated SingleItem instance.
     */
    public SingleItem setShowMostViewed(boolean showMostViewed) {
        if (showMostViewed) {
            this.showMostViewed = "true";
        } else {
            this.showMostViewed = "false";
        }
        return this;
    }

    /**
     * Set whether to show related items.
     *
     * @param showRelated True to show related items, false otherwise.
     * @return The updated SingleItem instance.
     */
    public SingleItem setShowRelated(boolean showRelated) {
        if (showRelated) {
            this.showRelated = "true";
        } else {
            this.showRelated = "false";
        }
        return this;
    }

    /**
     * Build the URL for API requests with specified parameters.
     *
     * @return The complete URL.
     * @throws UnsupportedEncodingException If encoding the URL components fails.
     */
    public String buildUrl() throws UnsupportedEncodingException {
        this.setBaseUrl(this.getBaseUrl() + this.id + "?api-key=" + this.apiKey);
        super.buildUrl();
        this.appendToBaseUrl("show-story-package", this.showStoryPackage)
                .appendToBaseUrl("show-editors-picks", this.showEditorsPicks)
                .appendToBaseUrl("show-most-viewed", this.showMostViewed)
                .appendToBaseUrl("show-related", this.showRelated);
        return this.baseUrl;
    }

    /**
     * Fetch data from the API and return the response as an AbstractResponse object.
     *
     * @return The API response as an AbstractResponse object.
     * @throws UnsupportedEncodingException If encoding the URL components fails.
     * @throws UnirestException If a Unirest HTTP request exception occurs.
     */
    public AbstractResponse fetch() throws UnsupportedEncodingException, UnirestException {
        this.buildUrl();
        String url = this.getBaseUrl();
        HttpRequest request = Unirest.get(url).header("accept", "application/json");
        HttpResponse<SingleItemResponseWrapper> response = request.asObject(SingleItemResponseWrapper.class);
        return response.getBody().getResponse();
    }

    /**
     * Construct a SingleItem instance with the provided base URL and API key.
     *
     * @param _baseUrl The base URL for API requests.
     * @param _apiKey The API key for authentication.
     */
    public SingleItem(String _baseUrl, String _apiKey) {
        super(_baseUrl);
        this.apiKey = _apiKey;
    }
}
