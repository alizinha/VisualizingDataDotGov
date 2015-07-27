
package alizinha.c4q.nyc.visualizingdatadotgov.api.models;


import com.google.gson.annotations.Expose;


public class DatasetInformation {

    @Expose
    private String Agency;

    /**
     * 
     * @return
     *     The Agency
     */
    public String getAgency() {
        return Agency;
    }

    /**
     * 
     * @param Agency
     *     The Agency
     */
    public void setAgency(String Agency) {
        this.Agency = Agency;
    }

}
