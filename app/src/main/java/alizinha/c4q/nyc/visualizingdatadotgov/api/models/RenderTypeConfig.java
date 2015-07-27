
package alizinha.c4q.nyc.visualizingdatadotgov.api.models;


import com.google.gson.annotations.Expose;


public class RenderTypeConfig {

    @Expose
    private Visible visible;

    /**
     * 
     * @return
     *     The visible
     */
    public Visible getVisible() {
        return visible;
    }

    /**
     * 
     * @param visible
     *     The visible
     */
    public void setVisible(Visible visible) {
        this.visible = visible;
    }

}
