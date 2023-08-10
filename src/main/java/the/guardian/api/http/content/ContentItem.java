package the.guardian.api.http.content;

/**
 * Represents an individual content item retrieved from The Guardian API.
 */
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

        /**
         * Retrieves the ID of the content item.
         *
         * @return The ID.
         */
        public String getId() {
                return this.id;
        }

        /**
         * Sets the ID of the content item.
         *
         * @param data The ID.
         */
        public void setId(String data) {
                this.id = data;
        }

        /**
         * Retrieves the type of the content item.
         *
         * @return The type.
         */
        public String getType() {
                return this.type;
        }

        /**
         * Sets the type of the content item.
         *
         * @param data The type.
         */
        public void setType(String data) {
                this.type = data;
        }

        /**
         * Retrieves the section ID of the content item.
         *
         * @return The section ID.
         */
        public String getSectionId() {
                return this.sectionId;
        }

        /**
         * Sets the section ID of the content item.
         *
         * @param data The section ID.
         */
        public void setSectionId(String data) {
                this.sectionId = data;
        }

        /**
         * Retrieves the section name of the content item.
         *
         * @return The section name.
         */
        public String getSectionName() {
                return this.sectionName;
        }

        /**
         * Sets the section name of the content item.
         *
         * @param data The section name.
         */
        public void setSectionName(String data) {
                this.sectionName = data;
        }

        /**
         * Retrieves the web publication date of the content item.
         *
         * @return The web publication date.
         */
        public String getWebPublicationDate() {
                return this.webPublicationDate;
        }

        /**
         * Sets the web publication date of the content item.
         *
         * @param data The web publication date.
         */
        public void setWebPublicationDate(String data) {
                this.webPublicationDate = data;
        }

        /**
         * Retrieves the web title of the content item.
         *
         * @return The web title.
         */
        public String getWebTitle() {
                return this.webTitle;
        }

        /**
         * Sets the web title of the content item.
         *
         * @param data The web title.
         */
        public void setWebTitle(String data) {
                this.webTitle = data;
        }

        /**
         * Retrieves the web URL of the content item.
         *
         * @return The web URL.
         */
        public String getWebUrl() {
                return this.webUrl;
        }

        /**
         * Sets the web URL of the content item.
         *
         * @param data The web URL.
         */
        public void setWebUrl(String data) {
                this.webUrl = data;
        }

        /**
         * Retrieves the API URL of the content item.
         *
         * @return The API URL.
         */
        public String getApiUrl() {
                return this.apiUrl;
        }

        /**
         * Sets the API URL of the content item.
         *
         * @param data The API URL.
         */
        public void setApiUrl(String data) {
                this.apiUrl = data;
        }

        /**
         * Retrieves the pillar ID of the content item.
         *
         * @return The pillar ID.
         */
        public String getPillarId() {
                return this.pillarId;
        }

        /**
         * Sets the pillar ID of the content item.
         *
         * @param data The pillar ID.
         */
        public void setPillarId(String data) {
                this.pillarId = data;
        }

        /**
         * Retrieves the pillar name of the content item.
         *
         * @return The pillar name.
         */
        public String getPillarName() {
                return this.pillarName;
        }

        /**
         * Sets the pillar name of the content item.
         *
         * @param data The pillar name.
         */
        public void setPillarName(String data) {
                this.pillarName = data;
        }

        /**
         * Checks if the content item is hosted.
         *
         * @return True if hosted, false otherwise.
         */
        public Boolean isHosted() {
                return this.isHosted;
        }

        /**
         * Sets whether the content item is hosted.
         *
         * @param data True if hosted, false otherwise.
         */
        public void setHosted(Boolean data) {
                this.isHosted = data;
        }

        /**
         * Returns a string representation of the ContentItem object.
         *
         * @return The string representation.
         */
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
