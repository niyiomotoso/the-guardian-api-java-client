package the.guardian.api.http.content;

import the.guardian.api.http.AbstractResponse;

import java.util.Arrays;

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

    
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String data) {
        this.status = data;
    }

    
    public String getUserTier() {
        return this.userTier;
    }

    public void setUserTier(String data) {
        this.userTier = data;
    }

    public int getTotal() {
        return this.total;
    }

    public void setTotal(int data) {
        this.total = data;
    }

    public int getStartIndex() {
        return this.startIndex;
    }

    public void setStartIndex(int data) {
        this.startIndex = data;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(int data) {
        this.pageSize = data;
    }

    public int getCurrentPage() {
        return this.currentPage;
    }

    public void setCurrentPage(int data) {
        this.currentPage = data;
    }

    public int getPages() {
        return this.pages;
    }

    public void setPages(int data) {
        this.pages = data;
    }

    
    public String getOrderBy() {
        return this.orderBy;
    }

    public void setOrderBy(String data) {
        this.orderBy = data;
    }

    
    public ContentItem[] getResults() {
        return this.results;
    }

    public void setResults( ContentItem[] data) {
        this.results = data;
    }

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
