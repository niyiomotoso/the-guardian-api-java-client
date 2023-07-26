package the.guardian.api.entity;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
public abstract class ContentApiEntity extends PageAndReferenceApiEntity {
    private String tag = "";
    
    private String rights = "";
    
    private String ids = "";
    
    private String productionOffice = "";
    
    private String lang = "";
    
    private String starRating = "";
    
    private String fromDate = "";
    
    private String toDate = "";
    
    private String useDate = "";
    
    private String orderBy = "";
    
    private String orderDate = "";
    
    private String showFields = "";
    
    private String showTags = "";
    
    private String showSection = "";
    
    private String showBlocks = "";
    
    private String showElements = "";
    
    private String showRights = "";

    
    protected String getTag() {
        return this.tag;
    }

    
    protected String getRights() {
        return this.rights;
    }
    
    protected String getIds() {
        return this.ids;
    }

    
    protected String getProductionOffice() {
        return this.productionOffice;
    }
    
    protected String getLang() {
        return this.lang;
    }
    
    protected String getStarRating() {
        return this.starRating;
    }
    
    
    protected String getFromDate() {
        return this.fromDate;
    }
    
    protected String getToDate() {
        return this.toDate;
    }
    
    protected String getUseDate() {
        return this.useDate;
    }
    
    protected String getOrderBy() {
        return this.orderBy;
    }
    
    protected String getOrderDate() {
        return this.orderDate;
    }
    
    protected String getShowFields() {
        return this.showFields;
    }
    
    protected String getShowTags() {
        return this.showTags;
    }
    
    protected String getShowSection() {
        return this.showSection;
    }
    
    protected String getShowBlocks() {
        return this.showBlocks;
    }
    
    protected String getShowElements() {
        return this.showElements;
    }
    
    protected String getShowRights() {
        return this.showRights;
    }
    
    public ContentApiEntity setTag(String tag) {
        this.tag = tag;
        return this;
    }

    
    public ContentApiEntity setRights(String rights) {
        this.rights = rights;
        return this;
    }

    
    public ContentApiEntity setIds(String ids) {
        this.ids = ids;
        return this;
    }

    
    public ContentApiEntity setProductionOffice(String productionOffice) {
        this.productionOffice = productionOffice;
        return this;
    }

    
    public ContentApiEntity setLang(String lang) {
        this.lang = lang;
        return this;
    }

    
    public ContentApiEntity setStarRating(String starRating) {
        this.starRating = starRating;
        return this;
    }

    
    public ContentApiEntity setFromDate(String fromDate) {
        this.fromDate = fromDate;
        return this;
    }

    
    public ContentApiEntity setToDate(String toDate) {
        this.toDate = toDate;
        return this;
    }

    
    public ContentApiEntity setUseDate(String useDate) {
        this.useDate = useDate;
        return this;
    }

    
    public ContentApiEntity setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    
    public ContentApiEntity setOrderDate(String orderDate) {
        this.orderDate = orderDate;
        return this;
    }

    
    public ContentApiEntity setShowFields(String showFields) {
        this.showFields = showFields;
        return this;
    }

    
    public ContentApiEntity setShowTags(String showTags) {
        this.showTags = showTags;
        return this;
    }

    
    public ContentApiEntity setShowSection(String showSection) {
        this.showSection = showSection;
        return this;
    }

    
    public ContentApiEntity setShowBlocks(String showBlocks) {
        this.showBlocks = showBlocks;
        return this;
    }

    
    public ContentApiEntity setShowElements(String showElements) {
        this.showElements = showElements;
        return this;
    }

    
    public ContentApiEntity setShowRights(String showElements) {
        this.showElements = showElements;
        return this;
    }

    public void buildUrl() throws UnsupportedEncodingException {
        this.appendToBaseUrl("tag", this.tag)
                .appendToBaseUrl("rights", this.rights)
                .appendToBaseUrl("ids", this.ids).
                appendToBaseUrl("production-office", this.productionOffice).
                appendToBaseUrl("lang", this.lang)
                .appendToBaseUrl("star-rating", this.starRating)
                .appendToBaseUrl("from-date", this.fromDate)
                .appendToBaseUrl("to-date", this.toDate)
                .appendToBaseUrl("use-date", this.useDate)
                .appendToBaseUrl("order-by", this.orderBy)
                .appendToBaseUrl("order-date", this.orderDate)
                .appendToBaseUrl("show-fields", this.showFields)
                .appendToBaseUrl("show-tags", this.showTags)
                .appendToBaseUrl("show-section", this.showSection)
                .appendToBaseUrl("show-blocks", this.showBlocks)
                .appendToBaseUrl("show-elements", this.showElements)
                .appendToBaseUrl("show-rights", this.showRights)
                .appendToBaseUrl("page", String.valueOf(this.getPage()))
                .appendToBaseUrl("page-size", String.valueOf(this.getPageSize()))
                .appendToBaseUrl("section", this.getSection())
                .appendToBaseUrl("reference", this.getReference())
                .appendToBaseUrl("reference-type", this.getReferenceType())
                .appendToBaseUrl("show-references", this.getShowReferences());
    }

    public ContentApiEntity(String _apiUrl) {
        super(_apiUrl);
    }
}
