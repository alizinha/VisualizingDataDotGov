
package alizinha.c4q.nyc.visualizingdatadotgov.api.models;


import com.google.gson.annotations.Expose;


public class Format {

    @Expose
    private String precisionStyle;
    @Expose
    private String align;
    @Expose
    private String noCommas;

    /**
     * 
     * @return
     *     The precisionStyle
     */
    public String getPrecisionStyle() {
        return precisionStyle;
    }

    /**
     * 
     * @param precisionStyle
     *     The precisionStyle
     */
    public void setPrecisionStyle(String precisionStyle) {
        this.precisionStyle = precisionStyle;
    }

    /**
     * 
     * @return
     *     The align
     */
    public String getAlign() {
        return align;
    }

    /**
     * 
     * @param align
     *     The align
     */
    public void setAlign(String align) {
        this.align = align;
    }

    /**
     * 
     * @return
     *     The noCommas
     */
    public String getNoCommas() {
        return noCommas;
    }

    /**
     * 
     * @param noCommas
     *     The noCommas
     */
    public void setNoCommas(String noCommas) {
        this.noCommas = noCommas;
    }

}
