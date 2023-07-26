package the.guardian.api.http.singleItem;

public final class SingleItem {
        
        private String id;
        
        private String type;
        
        private String sectionId;
        
        private String sectionName;
        
        private String webPublicationDate;
        
        private String webTitle;
        
        private String webUrl;
        
        private String apiUrl;
        
        private String pillarId;
        
        private String pillarName;
        
        private Boolean isHosted;

        
        public final String getId() {
                return this.id;
        }

        public final void setId(String data) {
                this.id = data;
        }

        
        public final String getType() {
                return this.type;
        }

        public final void setType(String data) {
                this.type = data;
        }

        
        public final String getSectionId() {
                return this.sectionId;
        }

        public final void setSectionId(String data) {
                this.sectionId = data;
        }

        
        public final String getSectionName() {
                return this.sectionName;
        }

        public final void setSectionName(String data) {
                this.sectionName = data;
        }

        
        public final String getWebPublicationDate() {
                return this.webPublicationDate;
        }

        public final void setWebPublicationDate(String data) {
                this.webPublicationDate = data;
        }

        
        public final String getWebTitle() {
                return this.webTitle;
        }

        public final void setWebTitle(String data) {
                this.webTitle = data;
        }

        
        public final String getWebUrl() {
                return this.webUrl;
        }

        public final void setWebUrl(String data) {
                this.webUrl = data;
        }

        
        public final String getApiUrl() {
                return this.apiUrl;
        }

        public final void setApiUrl(String data) {
                this.apiUrl = data;
        }

        
        public final String getPillarId() {
                return this.pillarId;
        }

        public final void setPillarId(String data) {
                this.pillarId = data;
        }

        
        public final String getPillarName() {
                return this.pillarName;
        }

        public final void setPillarName(String data) {
                this.pillarName = data;
        }

        
        public final Boolean isHosted() {
                return this.isHosted;
        }

        public final void setHosted( Boolean data) {
                this.isHosted = data;
        }

        @Override
        public String toString() {
                return "SingleItem{" +
                        "id='" + id + '\'' +
                        ", type='" + type + '\'' +
                        ", sectionId='" + sectionId + '\'' +
                        ", sectionName='" + sectionName + '\'' +
                        ", webPublicationDate='" + webPublicationDate + '\'' +
                        ", webTitle='" + webTitle + '\'' +
                        ", webUrl='" + webUrl + '\'' +
                        ", apiUrl='" + apiUrl + '\'' +
                        ", pillarId='" + pillarId + '\'' +
                        ", pillarName='" + pillarName + '\'' +
                        ", isHosted=" + isHosted +
                        '}';
        }
}
