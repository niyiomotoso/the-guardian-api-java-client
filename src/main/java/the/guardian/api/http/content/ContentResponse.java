package the.guardian.api.http.content;

import the.guardian.api.http.AbstractResponse;

import java.util.Arrays;

/**
 * Represents a response containing content items from The Guardian API.
 */
public class ContentResponse extends AbstractResponse {

    private String status;
    private String userTier;
    private int total;
    private int startIndex;
    private int pageSize;
    private int currentPage;
    private int pages;
    private String orderBy;
    private ContentItem[] results;

    /**
     * Retrieves the status of the content response.
     *
     * @return The status.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Sets the status of the content response.
     *
     * @param data The status.
     */
    public void setStatus(String data) {
        this.status = data;
    }

    /**
     * Retrieves the user tier of the content response.
     *
     * @return The user tier.
     */
    public String getUserTier() {
        return this.userTier;
    }

    /**
     * Sets the user tier of the content response.
     *
     * @param data The user tier.
     */
    public void setUserTier(String data) {
        this.userTier = data;
    }

    /**
     * Retrieves the total number of content items.
     *
     * @return The total number of content items.
     */
    public int getTotal() {
        return this.total;
    }

    /**
     * Sets the total number of content items.
     *
     * @param data The total number of content items.
     */
    public void setTotal(int data) {
        this.total = data;
    }

    /**
     * Retrieves the start index of the content response.
     *
     * @return The start index.
     */
    public int getStartIndex() {
        return this.startIndex;
    }

    /**
     * Sets the start index of the content response.
     *
     * @param data The start index.
     */
    public void setStartIndex(int data) {
        this.startIndex = data;
    }

    /**
     * Retrieves the page size of the content response.
     *
     * @return The page size.
     */
    public int getPageSize() {
        return this.pageSize;
    }

    /**
     * Sets the page size of the content response.
     *
     * @param data The page size.
     */
    public void setPageSize(int data) {
        this.pageSize = data;
    }

    /**
     * Retrieves the current page of the content response.
     *
     * @return The current page.
     */
    public int getCurrentPage() {
        return this.currentPage;
    }

    /**
     * Sets the current page of the content response.
     *
     * @param data The current page.
     */
    public void setCurrentPage(int data) {
        this.currentPage = data;
    }

    /**
     * Retrieves the total number of pages in the content response.
     *
     * @return The total number of pages.
     */
    public int getPages() {
        return this.pages;
    }

    /**
     * Sets the total number of pages in the content response.
     *
     * @param data The total number of pages.
     */
    public void setPages(int data) {
        this.pages = data;
    }

    /**
     * Retrieves the ordering criteria of the content response.
     *
     * @return The ordering criteria.
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * Sets the ordering criteria of the content response.
     *
     * @param data The ordering criteria.
     */
    public void setOrderBy(String data) {
        this.orderBy = data;
    }

    /**
     * Retrieves the array of content items in the response.
     *
     * @return The array of content items.
     */
    public ContentItem[] getResults() {
        return this.results;
    }

    /**
     * Sets the array of content items in the response.
     *
     * @param data The array of content items.
     */
    public void setResults(ContentItem[] data) {
        this.results = data;
    }

    /**
     * Returns a string representation of the ContentResponse object.
     *
     * @return The string representation.
     */
    @Override
    public String toString() {
        return "ContentResponse{" +
                "status='" + status + '\'' +
                ", userTier='" + userTier + '\'' +
                ", total=" + total +
                ", startIndex=" + startIndex +
                ", pageSize=" + pageSize +
                ", currentPage=" + currentPage +
                ", pages=" + pages +
                ", orderBy='" + orderBy + '\'' +
                ", results=" + Arrays.toString(results) +
                '}';
    }
}
