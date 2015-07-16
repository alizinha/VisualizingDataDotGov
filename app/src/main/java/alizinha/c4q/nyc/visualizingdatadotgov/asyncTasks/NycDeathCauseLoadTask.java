package alizinha.c4q.nyc.visualizingdatadotgov.asyncTasks;

import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import alizinha.c4q.nyc.visualizingdatadotgov.models.DeathData;
import alizinha.c4q.nyc.visualizingdatadotgov.models.NycLeadingCausesDeath;

/**
 * Created by c4q-Allison on 7/15/15.
 */
public class NycDeathCauseLoadTask extends AsyncTask<Void, Void, NycLeadingCausesDeath>{
    @Override
    protected NycLeadingCausesDeath doInBackground(Void... params) {
        NycLeadingCausesDeath nycLeadingCausesDeath = new NycLeadingCausesDeath();

        String jsonFeedUrlString = "https://data.cityofnewyork.us/api/views/jb7j-dtam/rows.json";
        try {
            //open a connection to the URL and created a buffered input reader to read the HTTP response
            URL feedUrl = new URL(jsonFeedUrlString);
            URLConnection urlConnection = feedUrl.openConnection();
            InputStream inputStream = urlConnection.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            //now read the HTTP response, a line at a time, into a string using StringBuilder
            StringBuilder builder = new StringBuilder();
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                builder.append(line + "\n");
            }

            String jsonString = builder.toString();

            //now convert the JSON string into JSON Object
            try {
                JSONObject topLevelObject = new JSONObject(jsonString);

                //now parse the JSON Object & retrieve the fields that we're interested in
                //meta.view.viewLastModified
                JSONObject meta = topLevelObject.getJSONObject("meta");
                JSONObject view = meta.getJSONObject("view");
                int createDate = view.getInt("createdAt");
                int lastModified = view.getInt("viewLastModified");
                nycLeadingCausesDeath.setCreateDate(createDate);
                nycLeadingCausesDeath.setLastUpdateDate(lastModified);

                List<DeathData> deathDataList = new ArrayList<>();
                JSONArray deathDataJsonArray = topLevelObject.getJSONArray("data");
                int rowCount = deathDataJsonArray.length();
                for (int rowIndex = 0 ; rowIndex < rowCount ; rowIndex++) {
                    //locate JSON row for deathData & parse the properties we're interested in
                    JSONArray rowDataJsonArray = deathDataJsonArray.getJSONArray(rowIndex);
                    String year = rowDataJsonArray.getString(8);
                    String ethnicity = rowDataJsonArray.getString(9);
                    String gender = rowDataJsonArray.getString(10);
                    String cause = rowDataJsonArray.getString(11);
                    int deathCount = rowDataJsonArray.getInt(12);
                    int deathPercent = rowDataJsonArray.getInt(13);

                    //create a new DeathData Object & load values in it
                    DeathData deathData = new DeathData();

                    deathData.setYear(year);
                    deathData.setEthnicity(ethnicity);
                    deathData.setGender(gender);
                    deathData.setCause(cause);
                    deathData.setDeathCount(deathCount);
                    deathData.setDeathPercent(deathPercent);

                    //add deathData to ArrayList
                    deathDataList.add(deathData);
                }

                nycLeadingCausesDeath.setDeathCauseDataList(deathDataList);

            } catch (JSONException e) {
                e.printStackTrace();
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return nycLeadingCausesDeath;
    }
}
