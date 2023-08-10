package the.guardian.api.http.sections;

/**
 * Wrapper class for the sections response from The Guardian API.
 */
public class SectionsResponseWrapper {
    private SectionsResponse response;

    /**
     * Retrieves the sections response.
     *
     * @return The sections response.
     */
    public final SectionsResponse getResponse() {
        return this.response;
    }

    /**
     * Sets the sections response.
     *
     * @param response The sections response to set.
     */
    public final void setResponse(SectionsResponse response) {
        this.response = response;
    }
}
