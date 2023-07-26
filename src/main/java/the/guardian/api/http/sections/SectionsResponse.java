package the.guardian.api.http.sections;

import the.guardian.api.http.AbstractResponse;

import java.util.Arrays;

public class SectionsResponse extends AbstractResponse {
    
    private String status;
    
    private String userTier;
    private int total;
    
    private SectionItem[] results;

    
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

    
    public SectionItem[] getResults() {
        return this.results;
    }

    public void setResults( SectionItem[] data) {
        this.results = data;
    }

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
