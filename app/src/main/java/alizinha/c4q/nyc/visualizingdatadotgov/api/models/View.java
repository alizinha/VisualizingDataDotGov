
package alizinha.c4q.nyc.visualizingdatadotgov.api.models;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;


public class View {

    @Expose
    private String id;
    @Expose
    private String name;
    @Expose
    private String attribution;
    @Expose
    private int averageRating;
    @Expose
    private String category;
    @Expose
    private int createdAt;
    @Expose
    private String description;
    @Expose
    private String displayType;
    @Expose
    private int downloadCount;
    @Expose
    private int indexUpdatedAt;
    @Expose
    private boolean newBackend;
    @Expose
    private int numberOfComments;
    @Expose
    private int oid;
    @Expose
    private boolean publicationAppendEnabled;
    @Expose
    private int publicationDate;
    @Expose
    private int publicationGroup;
    @Expose
    private String publicationStage;
    @Expose
    private int rowsUpdatedAt;
    @Expose
    private String rowsUpdatedBy;
    @Expose
    private String state;
    @Expose
    private int tableId;
    @Expose
    private int totalTimesRated;
    @Expose
    private int viewCount;
    @Expose
    private int viewLastModified;
    @Expose
    private String viewType;
    @Expose
    private List<Column> columns = new ArrayList<Column>();
    @Expose
    private List<Grant> grants = new ArrayList<Grant>();
    @Expose
    private Metadata metadata;
    @Expose
    private Owner owner;
    @Expose
    private Query query;
    @Expose
    private List<String> rights = new ArrayList<String>();
    @Expose
    private TableAuthor tableAuthor;
    @Expose
    private List<String> tags = new ArrayList<String>();
    @Expose
    private List<String> flags = new ArrayList<String>();

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The attribution
     */
    public String getAttribution() {
        return attribution;
    }

    /**
     * 
     * @param attribution
     *     The attribution
     */
    public void setAttribution(String attribution) {
        this.attribution = attribution;
    }

    /**
     * 
     * @return
     *     The averageRating
     */
    public int getAverageRating() {
        return averageRating;
    }

    /**
     * 
     * @param averageRating
     *     The averageRating
     */
    public void setAverageRating(int averageRating) {
        this.averageRating = averageRating;
    }

    /**
     * 
     * @return
     *     The category
     */
    public String getCategory() {
        return category;
    }

    /**
     * 
     * @param category
     *     The category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * 
     * @return
     *     The createdAt
     */
    public int getCreatedAt() {
        return createdAt;
    }

    /**
     * 
     * @param createdAt
     *     The createdAt
     */
    public void setCreatedAt(int createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The displayType
     */
    public String getDisplayType() {
        return displayType;
    }

    /**
     * 
     * @param displayType
     *     The displayType
     */
    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    /**
     * 
     * @return
     *     The downloadCount
     */
    public int getDownloadCount() {
        return downloadCount;
    }

    /**
     * 
     * @param downloadCount
     *     The downloadCount
     */
    public void setDownloadCount(int downloadCount) {
        this.downloadCount = downloadCount;
    }

    /**
     * 
     * @return
     *     The indexUpdatedAt
     */
    public int getIndexUpdatedAt() {
        return indexUpdatedAt;
    }

    /**
     * 
     * @param indexUpdatedAt
     *     The indexUpdatedAt
     */
    public void setIndexUpdatedAt(int indexUpdatedAt) {
        this.indexUpdatedAt = indexUpdatedAt;
    }

    /**
     * 
     * @return
     *     The newBackend
     */
    public boolean isNewBackend() {
        return newBackend;
    }

    /**
     * 
     * @param newBackend
     *     The newBackend
     */
    public void setNewBackend(boolean newBackend) {
        this.newBackend = newBackend;
    }

    /**
     * 
     * @return
     *     The numberOfComments
     */
    public int getNumberOfComments() {
        return numberOfComments;
    }

    /**
     * 
     * @param numberOfComments
     *     The numberOfComments
     */
    public void setNumberOfComments(int numberOfComments) {
        this.numberOfComments = numberOfComments;
    }

    /**
     * 
     * @return
     *     The oid
     */
    public int getOid() {
        return oid;
    }

    /**
     * 
     * @param oid
     *     The oid
     */
    public void setOid(int oid) {
        this.oid = oid;
    }

    /**
     * 
     * @return
     *     The publicationAppendEnabled
     */
    public boolean isPublicationAppendEnabled() {
        return publicationAppendEnabled;
    }

    /**
     * 
     * @param publicationAppendEnabled
     *     The publicationAppendEnabled
     */
    public void setPublicationAppendEnabled(boolean publicationAppendEnabled) {
        this.publicationAppendEnabled = publicationAppendEnabled;
    }

    /**
     * 
     * @return
     *     The publicationDate
     */
    public int getPublicationDate() {
        return publicationDate;
    }

    /**
     * 
     * @param publicationDate
     *     The publicationDate
     */
    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }

    /**
     * 
     * @return
     *     The publicationGroup
     */
    public int getPublicationGroup() {
        return publicationGroup;
    }

    /**
     * 
     * @param publicationGroup
     *     The publicationGroup
     */
    public void setPublicationGroup(int publicationGroup) {
        this.publicationGroup = publicationGroup;
    }

    /**
     * 
     * @return
     *     The publicationStage
     */
    public String getPublicationStage() {
        return publicationStage;
    }

    /**
     * 
     * @param publicationStage
     *     The publicationStage
     */
    public void setPublicationStage(String publicationStage) {
        this.publicationStage = publicationStage;
    }

    /**
     * 
     * @return
     *     The rowsUpdatedAt
     */
    public int getRowsUpdatedAt() {
        return rowsUpdatedAt;
    }

    /**
     * 
     * @param rowsUpdatedAt
     *     The rowsUpdatedAt
     */
    public void setRowsUpdatedAt(int rowsUpdatedAt) {
        this.rowsUpdatedAt = rowsUpdatedAt;
    }

    /**
     * 
     * @return
     *     The rowsUpdatedBy
     */
    public String getRowsUpdatedBy() {
        return rowsUpdatedBy;
    }

    /**
     * 
     * @param rowsUpdatedBy
     *     The rowsUpdatedBy
     */
    public void setRowsUpdatedBy(String rowsUpdatedBy) {
        this.rowsUpdatedBy = rowsUpdatedBy;
    }

    /**
     * 
     * @return
     *     The state
     */
    public String getState() {
        return state;
    }

    /**
     * 
     * @param state
     *     The state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 
     * @return
     *     The tableId
     */
    public int getTableId() {
        return tableId;
    }

    /**
     * 
     * @param tableId
     *     The tableId
     */
    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    /**
     * 
     * @return
     *     The totalTimesRated
     */
    public int getTotalTimesRated() {
        return totalTimesRated;
    }

    /**
     * 
     * @param totalTimesRated
     *     The totalTimesRated
     */
    public void setTotalTimesRated(int totalTimesRated) {
        this.totalTimesRated = totalTimesRated;
    }

    /**
     * 
     * @return
     *     The viewCount
     */
    public int getViewCount() {
        return viewCount;
    }

    /**
     * 
     * @param viewCount
     *     The viewCount
     */
    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    /**
     * 
     * @return
     *     The viewLastModified
     */
    public int getViewLastModified() {
        return viewLastModified;
    }

    /**
     * 
     * @param viewLastModified
     *     The viewLastModified
     */
    public void setViewLastModified(int viewLastModified) {
        this.viewLastModified = viewLastModified;
    }

    /**
     * 
     * @return
     *     The viewType
     */
    public String getViewType() {
        return viewType;
    }

    /**
     * 
     * @param viewType
     *     The viewType
     */
    public void setViewType(String viewType) {
        this.viewType = viewType;
    }

    /**
     * 
     * @return
     *     The columns
     */
    public List<Column> getColumns() {
        return columns;
    }

    /**
     * 
     * @param columns
     *     The columns
     */
    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }

    /**
     * 
     * @return
     *     The grants
     */
    public List<Grant> getGrants() {
        return grants;
    }

    /**
     * 
     * @param grants
     *     The grants
     */
    public void setGrants(List<Grant> grants) {
        this.grants = grants;
    }

    /**
     * 
     * @return
     *     The metadata
     */
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * 
     * @param metadata
     *     The metadata
     */
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    /**
     * 
     * @return
     *     The owner
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * 
     * @param owner
     *     The owner
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    /**
     * 
     * @return
     *     The query
     */
    public Query getQuery() {
        return query;
    }

    /**
     * 
     * @param query
     *     The query
     */
    public void setQuery(Query query) {
        this.query = query;
    }

    /**
     * 
     * @return
     *     The rights
     */
    public List<String> getRights() {
        return rights;
    }

    /**
     * 
     * @param rights
     *     The rights
     */
    public void setRights(List<String> rights) {
        this.rights = rights;
    }

    /**
     * 
     * @return
     *     The tableAuthor
     */
    public TableAuthor getTableAuthor() {
        return tableAuthor;
    }

    /**
     * 
     * @param tableAuthor
     *     The tableAuthor
     */
    public void setTableAuthor(TableAuthor tableAuthor) {
        this.tableAuthor = tableAuthor;
    }

    /**
     * 
     * @return
     *     The tags
     */
    public List<String> getTags() {
        return tags;
    }

    /**
     * 
     * @param tags
     *     The tags
     */
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    /**
     * 
     * @return
     *     The flags
     */
    public List<String> getFlags() {
        return flags;
    }

    /**
     * 
     * @param flags
     *     The flags
     */
    public void setFlags(List<String> flags) {
        this.flags = flags;
    }

}
