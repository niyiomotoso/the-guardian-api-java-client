package the.guardian.api.http.content;

public class ContentResponseWrapper {
    private ContentResponse response;

    public final ContentResponse getResponse() {
        return this.response;
    }

    public final void setResponse(ContentResponse response) {
        this.response = response;
    }
}