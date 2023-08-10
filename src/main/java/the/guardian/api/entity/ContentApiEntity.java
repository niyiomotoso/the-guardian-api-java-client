package the.guardian.api.entity;

import java.io.UnsupportedEncodingException;

/**
 * Abstract base class for entities interacting with content-related operations of The Guardian API.
 */
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

    /**
     * Retrieves the tag.
     *
     * @return The tag.
     */
    protected String getTag() {
        return this.tag;
    }

    /**
     * Retrieves the rights.
     *
     * @return The rights.
     */
    protected String getRights() {
        return this.rights;
    }

    /**
     * Retrieves the ids.
     *
     * @return The ids.
     */
    protected String getIds() {
        return this.ids;
    }

    /**
     * Retrieves the production office.
     *
     * @return The production office.
     */
    protected String getProductionOffice() {
        return this.productionOffice;
    }

    /**
     * Retrieves the lang.
     *
     * @return The lang.
     */
    protected String getLang() {
        return this.lang;
    }

    /**
     * Retrieves the star rating.
     *
     * @return The star rating.
     */
    protected String getStarRating() {
        return this.starRating;
    }

    /**
     * Retrieves the from date.
     *
     * @return The from date.
     */
    protected String getFromDate() {
        return this.fromDate;
    }

    /**
     * Retrieves the to date.
     *
     * @return The to date.
     */
    protected String getToDate() {
        return this.toDate;
    }

    /**
     * Retrieves the use date.
     *
     * @return The use date.
     */
    protected String getUseDate() {
        return this.useDate;
    }

    /**
     * Retrieves the order by.
     *
     * @return The order by.
     */
    protected String getOrderBy() {
        return this.orderBy;
    }

    /**
     * Retrieves the order date.
     *
     * @return The order date.
     */
    protected String getOrderDate() {
        return this.orderDate;
    }

    /**
     * Retrieves the show fields.
     *
     * @return The show fields.
     */
    protected String getShowFields() {
        return this.showFields;
    }

    /**
     * Retrieves the show tags.
     *
     * @return The show tags.
     */
    protected String getShowTags() {
        return this.showTags;
    }

    /**
     * Retrieves the show section.
     *
     * @return The show section.
     */
    protected String getShowSection() {
        return this.showSection;
    }

    /**
     * Retrieves the show blocks.
     *
     * @return The show blocks.
     */
    protected String getShowBlocks() {
        return this.showBlocks;
    }

    /**
     * Retrieves the show elements.
     *
     * @return The show elements.
     */
    protected String getShowElements() {
        return this.showElements;
    }

    /**
     * Retrieves the show rights.
     *
     * @return The show rights.
     */
    protected String getShowRights() {
        return this.showRights;
    }

    /**
     * Sets the tag.
     *
     * @param tag The tag.
     * @return The updated ContentApiEntity instance.
     */
    public ContentApiEntity setTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * Sets the rights.
     *
     * @param rights The rights.
     * @return The updated ContentApiEntity instance.
     */
    public ContentApiEntity setRights(String rights) {
        this.rights = rights;
        return this;
    }

    /**
     * Sets the ids.
     *
     * @param ids The ids.
     * @return The updated ContentApiEntity instance.
     */
    public ContentApiEntity setIds(String ids) {
        this.ids = ids;
        return this;
    }

    /**
     * Sets the production office.
     *
     * @param productionOffice The production office.
     * @return The updated ContentApiEntity instance.
     */
    public ContentApiEntity setProductionOffice(String productionOffice) {
        this.productionOffice = productionOffice;
        return this;
    }

    /**
     * Sets the lang.
     *
     * @param lang The lang.
     * @return The updated ContentApiEntity instance.
     */
    public ContentApiEntity setLang(String lang) {
        this.lang = lang;
        return this;
    }

    /**
     * Sets the star rating.
     *
     * @param starRating The star rating.
     * @return The updated ContentApiEntity instance.
     */
    public ContentApiEntity setStarRating(String starRating) {
        this.starRating = starRating;
        return this;
    }

    /**
     * Sets the from date.
     *
     * @param fromDate The from date.
     * @return The updated ContentApiEntity instance.
     */
    public ContentApiEntity setFromDate(String fromDate) {
        this.fromDate = fromDate;
        return this;
    }

    /**
     * Sets the to date.
     *
     * @param toDate The to date.
     * @return The updated ContentApiEntity instance.
     */
    public ContentApiEntity setToDate(String toDate) {
        this.toDate = toDate;
        return this;
    }

    /**
     * Sets the use date.
     *
     * @param useDate The use date.
     * @return The updated ContentApiEntity instance.
     */
    public ContentApiEntity setUseDate(String useDate) {
        this.useDate = useDate;
        return this;
    }

    /**
     * Sets the order by.
     *
     * @param orderBy The order by.
     * @return The updated ContentApiEntity instance.
     */
    public ContentApiEntity setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * Sets the order date.
     *
     * @param orderDate The order date.
     * @return The updated ContentApiEntity instance.
     */
    public ContentApiEntity setOrderDate(String orderDate) {
        this.orderDate = orderDate;
        return this;
    }

    /**
     * Sets the show fields.
     *
     * @param showFields The show fields.
     * @return The updated ContentApiEntity instance.
     */
    public ContentApiEntity setShowFields(String showFields) {
        this.showFields = showFields;
        return this;
    }

    /**
     * Sets the show tags.
     *
     * @param showTags The show tags.
     * @return The updated ContentApiEntity instance.
     */
    public ContentApiEntity setShowTags(String showTags) {
        this.showTags = showTags;
        return this;
    }

    /**
     * Sets the show section.
     *
     * @param showSection The show section.
     * @return The updated ContentApiEntity instance.
     */
    public ContentApiEntity setShowSection(String showSection) {
        this.showSection = showSection;
        return this;
    }

    /**
     * Sets the show blocks.
     *
     * @param showBlocks The show blocks.
     * @return The updated ContentApiEntity instance.
     */
    public ContentApiEntity setShowBlocks(String showBlocks) {
        this.showBlocks = showBlocks;
        return this;
    }

    /**
     * Sets the show elements.
     *
     * @param showElements The show elements.
     * @return The updated ContentApiEntity instance.
     */
    public ContentApiEntity setShowElements(String showElements) {
        this.showElements = showElements;
        return this;
    }

    /**
     * Sets the show rights.
     *
     * @param showRights The show rights.
     * @return The updated ContentApiEntity instance.
     */
    public ContentApiEntity setShowRights(String showRights) {
        this.showRights = showRights;
        return this;
    }

    /**
     * Builds the URL for API requests.
     *
     * @return The built URL.
     * @throws UnsupportedEncodingException If encoding URL components fails.
     */
    public String buildUrl() throws UnsupportedEncodingException {
        this.appendToBaseUrl("tag", this.tag)
                .appendToBaseUrl("rights", this.rights)
                .appendToBaseUrl("ids", this.ids)
                .appendToBaseUrl("production-office", this.productionOffice)
                .appendToBaseUrl("lang", this.lang)
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

        return this.baseUrl;
    }

    /**
     * Constructs a ContentApiEntity instance with the provided API URL.
     *
     * @param _apiUrl The API URL for content-related operations.
     */
    public ContentApiEntity(String _apiUrl) {
        super(_apiUrl);
    }
}
