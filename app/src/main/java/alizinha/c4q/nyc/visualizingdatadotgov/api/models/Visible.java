
package alizinha.c4q.nyc.visualizingdatadotgov.api.models;


import com.google.gson.annotations.Expose;


public class Visible {

    @Expose
    private boolean table;

    /**
     * 
     * @return
     *     The table
     */
    public boolean isTable() {
        return table;
    }

    /**
     * 
     * @param table
     *     The table
     */
    public void setTable(boolean table) {
        this.table = table;
    }

}
