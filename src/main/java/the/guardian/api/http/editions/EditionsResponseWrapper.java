package the.guardian.api.http.editions;

/**
 * Wrapper class for encapsulating an EditionsResponse object.
 */
public class EditionsResponseWrapper {
    private EditionsResponse response;

    /**
     * Retrieves the encapsulated EditionsResponse object.
     *
     * @return The EditionsResponse object.
     */
    public final EditionsResponse getResponse() {
        return this.response;
    }

    /**
     * Sets the encapsulated EditionsResponse object.
     *
     * @param response The EditionsResponse object to set.
     */
    public final void setResponse(EditionsResponse response) {
        this.response = response;
    }
}
