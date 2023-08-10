package the.guardian.api.http.editions;

import the.guardian.api.http.AbstractResponse;

import java.util.Arrays;

/**
 * Represents a response from The Guardian API for editions.
 */
public class EditionsResponse extends AbstractResponse {

    private String status;

    private String userTier;
    private int total;

    private EditionItem[] results;

    /**
     * Retrieves the status of the response.
     *
     * @return The status.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Sets the status of the response.
     *
     * @param data The status.
     */
    public void setStatus(String data) {
        this.status = data;
    }

    /**
     * Retrieves the user tier of the response.
     *
     * @return The user tier.
     */
    public String getUserTier() {
        return this.userTier;
    }

    /**
     * Sets the user tier of the response.
     *
     * @param data The user tier.
     */
    public void setUserTier(String data) {
        this.userTier = data;
    }

    /**
     * Retrieves the total count of editions in the response.
     *
     * @return The total count.
     */
    public int getTotal() {
        return this.total;
    }

    /**
     * Sets the total count of editions in the response.
     *
     * @param data The total count.
     */
    public void setTotal(int data) {
        this.total = data;
    }

    /**
     * Retrieves the array of edition items in the response.
     *
     * @return The array of edition items.
     */
    public EditionItem[] getResults() {
        return this.results;
    }

    /**
     * Sets the array of edition items in the response.
     *
     * @param data The array of edition items.
     */
    public void setResults(EditionItem[] data) {
        this.results = data;
    }

    /**
     * Returns a string representation of the EditionsResponse object.
     *
     * @return The string representation.
     */
    @Override
    public String toString() {
        return "EditionsResponse{" +
                "status='" + status + '\'' +
                ", userTier='" + userTier + '\'' +
                ", total=" + total +
                ", results=" + Arrays.toString(results) +
                '}';
    }
}
