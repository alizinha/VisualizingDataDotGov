
package alizinha.c4q.nyc.visualizingdatadotgov.api.models;


import com.google.gson.annotations.Expose;


public class Column {

    @Expose
    private int id;
    @Expose
    private String name;
    @Expose
    private String dataTypeName;
    @Expose
    private String fieldName;
    @Expose
    private int position;
    @Expose
    private String renderTypeName;
    @Expose
    private Format format;
    @Expose
    private int tableColumnId;
    @Expose
    private int width;
    @Expose
    private CachedContents cachedContents;

    /**
     * 
     * @return
     *     The id
     */
    public int getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(int id) {
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
     *     The dataTypeName
     */
    public String getDataTypeName() {
        return dataTypeName;
    }

    /**
     * 
     * @param dataTypeName
     *     The dataTypeName
     */
    public void setDataTypeName(String dataTypeName) {
        this.dataTypeName = dataTypeName;
    }

    /**
     * 
     * @return
     *     The fieldName
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * 
     * @param fieldName
     *     The fieldName
     */
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    /**
     * 
     * @return
     *     The position
     */
    public int getPosition() {
        return position;
    }

    /**
     * 
     * @param position
     *     The position
     */
    public void setPosition(int position) {
        this.position = position;
    }

    /**
     * 
     * @return
     *     The renderTypeName
     */
    public String getRenderTypeName() {
        return renderTypeName;
    }

    /**
     * 
     * @param renderTypeName
     *     The renderTypeName
     */
    public void setRenderTypeName(String renderTypeName) {
        this.renderTypeName = renderTypeName;
    }

    /**
     * 
     * @return
     *     The format
     */
    public Format getFormat() {
        return format;
    }

    /**
     * 
     * @param format
     *     The format
     */
    public void setFormat(Format format) {
        this.format = format;
    }

    /**
     * 
     * @return
     *     The tableColumnId
     */
    public int getTableColumnId() {
        return tableColumnId;
    }

    /**
     * 
     * @param tableColumnId
     *     The tableColumnId
     */
    public void setTableColumnId(int tableColumnId) {
        this.tableColumnId = tableColumnId;
    }

    /**
     * 
     * @return
     *     The width
     */
    public int getWidth() {
        return width;
    }

    /**
     * 
     * @param width
     *     The width
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * 
     * @return
     *     The cachedContents
     */
    public CachedContents getCachedContents() {
        return cachedContents;
    }

    /**
     * 
     * @param cachedContents
     *     The cachedContents
     */
    public void setCachedContents(CachedContents cachedContents) {
        this.cachedContents = cachedContents;
    }

}
