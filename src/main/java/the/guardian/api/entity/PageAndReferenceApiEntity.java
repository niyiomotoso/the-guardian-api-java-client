package the.guardian.api.entity;

/**
 * * Class PageAndReferenceAPIEntity
 *
 * Base class for guardian API entities that have page & reference attributes
 */
public abstract class PageAndReferenceApiEntity extends ApiEntity {
    private int page = 1;
    private int pageSize = 20;
    
    private String section = "";
    
    private String reference = "";
    
    private String referenceType = "";
    
    private String showReferences = "";

    public PageAndReferenceApiEntity(String _apiUrl) {
        super(_apiUrl);
    }

    public int getPage() {
        return this.page;
    }

    public int getPageSize() {
        return this.pageSize;
    }
    
    public String getSection() {
        return this.section;
    }
    
    public String getReference() {
        return this.reference;
    }
    
    public String getReferenceType() {
        return this.referenceType;
    }

    
    public String getShowReferences() {
        return this.showReferences;
    }

    
    public PageAndReferenceApiEntity setPage(int page) {
        if (page < 1) {
        }

        this.page = page;
        return this;
    }

    
    public PageAndReferenceApiEntity setPageSize(int pageSize) {
        if (pageSize < 1) {
        }

        this.pageSize = pageSize;
        return this;
    }

    
    public PageAndReferenceApiEntity setSection(String section) {
        this.section = section;

        return this;
    }

    
    public PageAndReferenceApiEntity setReference(String reference) {
        this.reference = reference;

        return this;
    }

    
    public PageAndReferenceApiEntity setReferenceType(String referenceType) {
        this.referenceType = referenceType;

        return this;
    }

    
    public PageAndReferenceApiEntity setShowReferences(String showReferences) {
        this.showReferences = showReferences;

        return this;
    }
}
