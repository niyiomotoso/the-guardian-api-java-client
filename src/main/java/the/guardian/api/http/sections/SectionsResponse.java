package the.guardian.api.http.sections;

import the.guardian.api.http.AbstractResponse;

import java.util.Arrays;

/**
 * Represents a response containing sections from The Guardian API.
 */
public class SectionsResponse extends AbstractResponse {

    private String status;

    private String userTier;
    private int total;

    private SectionItem[] results;

    /**
     * Retrieves the status of the sections response.
     *
     * @return The status.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Sets the status of the sections response.
     *
     * @param data The status to set.
     */
    public void setStatus(String data) {
        this.status = data;
    }

    /**
     * Retrieves the user tier of the sections response.
     *
     * @return The user tier.
     */
    public String getUserTier() {
        return this.userTier;
    }

    /**
     * Sets the user tier of the sections response.
     *
     * @param data The user tier to set.
     */
    public void setUserTier(String data) {
        this.userTier = data;
    }

    /**
     * Retrieves the total number of sections.
     *
     * @return The total number of sections.
     */
    public int getTotal() {
        return this.total;
    }

    /**
     * Sets the total number of sections.
     *
     * @param data The total number of sections to set.
     */
    public void setTotal(int data) {
        this.total = data;
    }

    /**
     * Retrieves the results (section items) of the response.
     *
     * @return The section items.
     */
    public SectionItem[] getResults() {
        return this.results;
    }

    /**
     * Sets the results (section items) of the response.
     *
     * @param data The section items to set.
     */
    public void setResults(SectionItem[] data) {
        this.results = data;
    }

    /**
     * Returns a string representation of the SectionsResponse object.
     *
     * @return The string representation.
     */
    @Override
    public String toString() {
        return "SectionsResponse{" +
                "status='" + status + '\'' +
                ", userTier='" + userTier + '\'' +
                ", total=" + total +
                ", results=" + Arrays.toString(results) +
                '}';
    }
}
