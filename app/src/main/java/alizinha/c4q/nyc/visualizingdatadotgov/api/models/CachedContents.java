
package alizinha.c4q.nyc.visualizingdatadotgov.api.models;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class CachedContents {

    @SerializedName("non_null")
    @Expose
    private int nonNull;
    @Expose
    private String smallest;
    @Expose
    private String sum;
    @SerializedName("null")
    @Expose
    private int _null;
    @Expose
    private String average;
    @Expose
    private String largest;
    @Expose
    private List<Top> top = new ArrayList<Top>();

    /**
     * 
     * @return
     *     The nonNull
     */
    public int getNonNull() {
        return nonNull;
    }

    /**
     * 
     * @param nonNull
     *     The non_null
     */
    public void setNonNull(int nonNull) {
        this.nonNull = nonNull;
    }

    /**
     * 
     * @return
     *     The smallest
     */
    public String getSmallest() {
        return smallest;
    }

    /**
     * 
     * @param smallest
     *     The smallest
     */
    public void setSmallest(String smallest) {
        this.smallest = smallest;
    }

    /**
     * 
     * @return
     *     The sum
     */
    public String getSum() {
        return sum;
    }

    /**
     * 
     * @param sum
     *     The sum
     */
    public void setSum(String sum) {
        this.sum = sum;
    }

    /**
     * 
     * @return
     *     The _null
     */
    public int getNull() {
        return _null;
    }

    /**
     * 
     * @param _null
     *     The null
     */
    public void setNull(int _null) {
        this._null = _null;
    }

    /**
     * 
     * @return
     *     The average
     */
    public String getAverage() {
        return average;
    }

    /**
     * 
     * @param average
     *     The average
     */
    public void setAverage(String average) {
        this.average = average;
    }

    /**
     * 
     * @return
     *     The largest
     */
    public String getLargest() {
        return largest;
    }

    /**
     * 
     * @param largest
     *     The largest
     */
    public void setLargest(String largest) {
        this.largest = largest;
    }

    /**
     * 
     * @return
     *     The top
     */
    public List<Top> getTop() {
        return top;
    }

    /**
     * 
     * @param top
     *     The top
     */
    public void setTop(List<Top> top) {
        this.top = top;
    }

}
