package the.guardian.api.http.content;

/**
 * Wrapper class for encapsulating a ContentResponse object from The Guardian API.
 */
public class ContentResponseWrapper {
    private ContentResponse response;

    /**
     * Retrieves the encapsulated ContentResponse object.
     *
     * @return The encapsulated ContentResponse object.
     */
    public final ContentResponse getResponse() {
        return this.response;
    }

    /**
     * Sets the encapsulated ContentResponse object.
     *
     * @param response The ContentResponse object to be encapsulated.
     */
    public final void setResponse(ContentResponse response) {
        this.response = response;
    }
}
