package the.guardian.api.entity;

/**
 * Base class for Guardian API entities that have page and reference attributes.
 */
public abstract class PageAndReferenceApiEntity extends ApiEntity {
    private int page = 1;
    private int pageSize = 20;

    private String section = "";
    private String reference = "";
    private String referenceType = "";
    private String showReferences = "";

    /**
     * Constructs a PageAndReferenceApiEntity instance with the provided API URL.
     *
     * @param _apiUrl The API URL for page and reference related operations.
     */
    public PageAndReferenceApiEntity(String _apiUrl) {
        super(_apiUrl);
    }

    /**
     * Retrieves the page number.
     *
     * @return The page number.
     */
    public int getPage() {
        return this.page;
    }

    /**
     * Retrieves the page size.
     *
     * @return The page size.
     */
    public int getPageSize() {
        return this.pageSize;
    }

    /**
     * Retrieves the section.
     *
     * @return The section.
     */
    public String getSection() {
        return this.section;
    }

    /**
     * Retrieves the reference.
     *
     * @return The reference.
     */
    public String getReference() {
        return this.reference;
    }

    /**
     * Retrieves the reference type.
     *
     * @return The reference type.
     */
    public String getReferenceType() {
        return this.referenceType;
    }

    /**
     * Retrieves whether to show references.
     *
     * @return The show references value.
     */
    public String getShowReferences() {
        return this.showReferences;
    }

    /**
     * Sets the page number.
     *
     * @param page The page number.
     * @return The updated PageAndReferenceApiEntity instance.
     */
    public PageAndReferenceApiEntity setPage(int page) {
        if (page < 1) {
            // Handle invalid page value if needed.
        }

        this.page = page;
        return this;
    }

    /**
     * Sets the page size.
     *
     * @param pageSize The page size.
     * @return The updated PageAndReferenceApiEntity instance.
     */
    public PageAndReferenceApiEntity setPageSize(int pageSize) {
        if (pageSize < 1) {
            // Handle invalid pageSize value if needed.
        }

        this.pageSize = pageSize;
        return this;
    }

    /**
     * Sets the section.
     *
     * @param section The section.
     * @return The updated PageAndReferenceApiEntity instance.
     */
    public PageAndReferenceApiEntity setSection(String section) {
        this.section = section;
        return this;
    }

    /**
     * Sets the reference.
     *
     * @param reference The reference.
     * @return The updated PageAndReferenceApiEntity instance.
     */
    public PageAndReferenceApiEntity setReference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * Sets the reference type.
     *
     * @param referenceType The reference type.
     * @return The updated PageAndReferenceApiEntity instance.
     */
    public PageAndReferenceApiEntity setReferenceType(String referenceType) {
        this.referenceType = referenceType;
        return this;
    }

    /**
     * Sets whether to show references.
     *
     * @param showReferences The show references value.
     * @return The updated PageAndReferenceApiEntity instance.
     */
    public PageAndReferenceApiEntity setShowReferences(String showReferences) {
        this.showReferences = showReferences;
        return this;
    }
}
