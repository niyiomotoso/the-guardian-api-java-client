package the.guardian.api.http.content;

public class ContentItem {
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

       
        public String getId() {
                return this.id;
        }

        public void setId(String data) {
                this.id = data;
        }

       
        public String getType() {
                return this.type;
        }

        public void setType(String data) {
                this.type = data;
        }

       
        public String getSectionId() {
                return this.sectionId;
        }

        public void setSectionId(String data) {
                this.sectionId = data;
        }

       
        public String getSectionName() {
                return this.sectionName;
        }

        public void setSectionName(String data) {
                this.sectionName = data;
        }

       
        public String getWebPublicationDate() {
                return this.webPublicationDate;
        }

        public void setWebPublicationDate(String data) {
                this.webPublicationDate = data;
        }

       
        public String getWebTitle() {
                return this.webTitle;
        }

        public void setWebTitle(String data) {
                this.webTitle = data;
        }

       
        public String getWebUrl() {
                return this.webUrl;
        }

        public void setWebUrl(String data) {
                this.webUrl = data;
        }

       
        public String getApiUrl() {
                return this.apiUrl;
        }

        public void setApiUrl(String data) {
                this.apiUrl = data;
        }

       
        public String getPillarId() {
                return this.pillarId;
        }

        public void setPillarId(String data) {
                this.pillarId = data;
        }

       
        public String getPillarName() {
                return this.pillarName;
        }

        public void setPillarName(String data) {
                this.pillarName = data;
        }

       
        public Boolean isHosted() {
                return this.isHosted;
        }

        public void setHosted(Boolean data) {
                this.isHosted = data;
        }

        @Override
        public String toString() {
                return "ContentItem{" +
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
