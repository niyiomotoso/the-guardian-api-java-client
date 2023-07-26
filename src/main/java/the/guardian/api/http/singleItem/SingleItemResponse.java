package the.guardian.api.http.singleItem;

import the.guardian.api.http.AbstractResponse;

public class SingleItemResponse extends AbstractResponse {
    private String status;
    
    private String userTier;
    private int total;
    
    private SingleItem content;

    
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

    
    public SingleItem getContent() {
        return this.content;
    }

    public void setContent( SingleItem data) {
        this.content = data;
    }

    @Override
    public String toString() {
        return "SingleItemResponse{" +
                "status='" + status + '\'' +
                ", userTier='" + userTier + '\'' +
                ", total=" + total +
                ", content=" + content +
                '}';
    }
}
