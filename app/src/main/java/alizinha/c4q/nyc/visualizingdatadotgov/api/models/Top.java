
package alizinha.c4q.nyc.visualizingdatadotgov.api.models;


import com.google.gson.annotations.Expose;


public class Top {

    @Expose
    private int count;
    @Expose
    private String item;

    /**
     * 
     * @return
     *     The count
     */
    public int getCount() {
        return count;
    }

    /**
     * 
     * @param count
     *     The count
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * 
     * @return
     *     The item
     */
    public String getItem() {
        return item;
    }

    /**
     * 
     * @param item
     *     The item
     */
    public void setItem(String item) {
        this.item = item;
    }

}
