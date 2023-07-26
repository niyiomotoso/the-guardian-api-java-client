package the.guardian.api.http.singleItem;

import the.guardian.api.http.sections.SectionsResponse;

public class SingleItemResponseWrapper {
    private SingleItemResponse response;

    public final SingleItemResponse getResponse() {
        return this.response;
    }

    public final void setResponse(SingleItemResponse response) {
        this.response = response;
    }
}
