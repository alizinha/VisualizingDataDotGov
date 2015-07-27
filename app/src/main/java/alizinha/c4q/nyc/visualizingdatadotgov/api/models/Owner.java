
package alizinha.c4q.nyc.visualizingdatadotgov.api.models;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;


public class Owner {

    @Expose
    private String id;
    @Expose
    private String displayName;
    @Expose
    private String roleName;
    @Expose
    private String screenName;
    @Expose
    private List<String> rights = new ArrayList<String>();

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * 
     * @param displayName
     *     The displayName
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * 
     * @return
     *     The roleName
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 
     * @param roleName
     *     The roleName
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * 
     * @return
     *     The screenName
     */
    public String getScreenName() {
        return screenName;
    }

    /**
     * 
     * @param screenName
     *     The screenName
     */
    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    /**
     * 
     * @return
     *     The rights
     */
    public List<String> getRights() {
        return rights;
    }

    /**
     * 
     * @param rights
     *     The rights
     */
    public void setRights(List<String> rights) {
        this.rights = rights;
    }

}
