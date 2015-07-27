package alizinha.c4q.nyc.visualizingdatadotgov.api.helpers;

import java.util.ArrayList;
import java.util.List;

import alizinha.c4q.nyc.visualizingdatadotgov.api.models.DeathDataFeed;
import alizinha.c4q.nyc.visualizingdatadotgov.api.models.View;
import alizinha.c4q.nyc.visualizingdatadotgov.asyncTasks.NycDeathCauseLoadTask;
import alizinha.c4q.nyc.visualizingdatadotgov.models.DeathData;
import alizinha.c4q.nyc.visualizingdatadotgov.models.NycLeadingCausesDeath;

/**
 * Created by c4q-Allison on 7/26/15.
 */
public class FeedToModelTransformer {

    public static NycLeadingCausesDeath transformFeed(DeathDataFeed feed) {

        NycLeadingCausesDeath nycLeadingCausesDeath = new NycLeadingCausesDeath();

        List<DeathData> deathDataList = new ArrayList<>();

        View view = feed.getMeta().getView();

        nycLeadingCausesDeath.setCreateDate(view.getCreatedAt());
        nycLeadingCausesDeath.setLastUpdateDate(view.getRowsUpdatedAt());

        for (List<String> row : feed.getData()) {

            String year = row.get(8);
            String ethnicity = row.get(9);
            String gender = row.get(10);
            String cause = row.get(11);
            int deathCount = Integer.parseInt(row.get(12));
            int deathPercent =Integer.parseInt(row.get(13));

            //create a new DeathData Object & load values in it
            DeathData deathData = new DeathData();

            deathData.setYear(year);
            deathData.setEthnicity(ethnicity);
            deathData.setGender(gender);
            deathData.setCause(cause);
            deathData.setDeathCount(deathCount);
            deathData.setDeathPercent(deathPercent);

            deathDataList.add(deathData);
        }
        nycLeadingCausesDeath.setDeathCauseDataList(deathDataList);
        return nycLeadingCausesDeath;
    }
}
