
package alizinha.c4q.nyc.visualizingdatadotgov.api.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class CustomFields {

    @Expose
    private alizinha.c4q.nyc.visualizingdatadotgov.api.models.Update Update;
    @SerializedName("Dataset Information")
    @Expose
    private alizinha.c4q.nyc.visualizingdatadotgov.api.models.DatasetInformation DatasetInformation;

    /**
     * 
     * @return
     *     The Update
     */
    public alizinha.c4q.nyc.visualizingdatadotgov.api.models.Update getUpdate() {
        return Update;
    }

    /**
     * 
     * @param Update
     *     The Update
     */
    public void setUpdate(alizinha.c4q.nyc.visualizingdatadotgov.api.models.Update Update) {
        this.Update = Update;
    }

    /**
     * 
     * @return
     *     The DatasetInformation
     */
    public alizinha.c4q.nyc.visualizingdatadotgov.api.models.DatasetInformation getDatasetInformation() {
        return DatasetInformation;
    }

    /**
     * 
     * @param DatasetInformation
     *     The Dataset Information
     */
    public void setDatasetInformation(alizinha.c4q.nyc.visualizingdatadotgov.api.models.DatasetInformation DatasetInformation) {
        this.DatasetInformation = DatasetInformation;
    }

}
