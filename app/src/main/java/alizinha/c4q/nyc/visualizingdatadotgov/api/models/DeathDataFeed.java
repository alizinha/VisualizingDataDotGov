
package alizinha.c4q.nyc.visualizingdatadotgov.api.models;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;


public class DeathDataFeed {

    @Expose
    private Meta meta;
    @Expose
    private List<List<String>> data = new ArrayList<List<String>>();

    /**
     * 
     * @return
     *     The meta
     */
    public Meta getMeta() {
        return meta;
    }

    /**
     * 
     * @param meta
     *     The meta
     */
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    /**
     * 
     * @return
     *     The data
     */
    public List<List<String>> getData() {
        return data;
    }

    /**
     * 
     * @param data
     *     The data
     */
    public void setData(List<List<String>> data) {
        this.data = data;
    }

}
