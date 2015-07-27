
package alizinha.c4q.nyc.visualizingdatadotgov.api.models;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Metadata {

    @SerializedName("custom_fields")
    @Expose
    private CustomFields customFields;
    @Expose
    private RenderTypeConfig renderTypeConfig;
    @Expose
    private List<String> availableDisplayTypes = new ArrayList<String>();
    @Expose
    private String rdfSubject;

    /**
     * 
     * @return
     *     The customFields
     */
    public CustomFields getCustomFields() {
        return customFields;
    }

    /**
     * 
     * @param customFields
     *     The custom_fields
     */
    public void setCustomFields(CustomFields customFields) {
        this.customFields = customFields;
    }

    /**
     * 
     * @return
     *     The renderTypeConfig
     */
    public RenderTypeConfig getRenderTypeConfig() {
        return renderTypeConfig;
    }

    /**
     * 
     * @param renderTypeConfig
     *     The renderTypeConfig
     */
    public void setRenderTypeConfig(RenderTypeConfig renderTypeConfig) {
        this.renderTypeConfig = renderTypeConfig;
    }

    /**
     * 
     * @return
     *     The availableDisplayTypes
     */
    public List<String> getAvailableDisplayTypes() {
        return availableDisplayTypes;
    }

    /**
     * 
     * @param availableDisplayTypes
     *     The availableDisplayTypes
     */
    public void setAvailableDisplayTypes(List<String> availableDisplayTypes) {
        this.availableDisplayTypes = availableDisplayTypes;
    }

    /**
     * 
     * @return
     *     The rdfSubject
     */
    public String getRdfSubject() {
        return rdfSubject;
    }

    /**
     * 
     * @param rdfSubject
     *     The rdfSubject
     */
    public void setRdfSubject(String rdfSubject) {
        this.rdfSubject = rdfSubject;
    }

}
