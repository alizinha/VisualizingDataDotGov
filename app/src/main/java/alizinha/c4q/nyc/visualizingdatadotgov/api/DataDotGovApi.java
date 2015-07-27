package alizinha.c4q.nyc.visualizingdatadotgov.api;

import alizinha.c4q.nyc.visualizingdatadotgov.api.models.DeathDataFeed;
import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by c4q-Allison on 7/26/15.
 */
public interface DataDotGovApi {

    @GET("/views/jb7j-dtam/rows.json")
    public void getDeathCausesData(Callback<DeathDataFeed> callback);
}
