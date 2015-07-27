
package alizinha.c4q.nyc.visualizingdatadotgov.api.models;


import com.google.gson.annotations.Expose;


public class Meta {

    @Expose
    private View view;

    /**
     * 
     * @return
     *     The view
     */
    public View getView() {
        return view;
    }

    /**
     * 
     * @param view
     *     The view
     */
    public void setView(View view) {
        this.view = view;
    }

}
