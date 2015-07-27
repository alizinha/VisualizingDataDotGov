
package alizinha.c4q.nyc.visualizingdatadotgov.api.models;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;


public class Grant {

    @Expose
    private boolean inherited;
    @Expose
    private String type;
    @Expose
    private List<String> flags = new ArrayList<String>();

    /**
     * 
     * @return
     *     The inherited
     */
    public boolean isInherited() {
        return inherited;
    }

    /**
     * 
     * @param inherited
     *     The inherited
     */
    public void setInherited(boolean inherited) {
        this.inherited = inherited;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The flags
     */
    public List<String> getFlags() {
        return flags;
    }

    /**
     * 
     * @param flags
     *     The flags
     */
    public void setFlags(List<String> flags) {
        this.flags = flags;
    }

}
