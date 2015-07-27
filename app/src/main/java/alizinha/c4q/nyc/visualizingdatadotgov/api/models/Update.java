
package alizinha.c4q.nyc.visualizingdatadotgov.api.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Update {

    @SerializedName("Update Frequency")
    @Expose
    private String UpdateFrequency;

    /**
     * 
     * @return
     *     The UpdateFrequency
     */
    public String getUpdateFrequency() {
        return UpdateFrequency;
    }

    /**
     * 
     * @param UpdateFrequency
     *     The Update Frequency
     */
    public void setUpdateFrequency(String UpdateFrequency) {
        this.UpdateFrequency = UpdateFrequency;
    }

}
