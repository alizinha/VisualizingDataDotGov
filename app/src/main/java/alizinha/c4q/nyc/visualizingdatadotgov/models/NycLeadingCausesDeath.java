package alizinha.c4q.nyc.visualizingdatadotgov.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by c4q-Allison on 7/15/15.
 */
public class NycLeadingCausesDeath {

    private int createDate;
    private int lastUpdateDate;
    private List<DeathData> deathCauseDataList;

    public NycLeadingCausesDeath() {
        deathCauseDataList = new ArrayList<>();
    }

    public int getCreateDate() {
        return createDate;
    }

    public void setCreateDate(int createDate) {
        this.createDate = createDate;
    }

    public int getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(int lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public List<DeathData> getDeathCauseDataList() {
        return deathCauseDataList;
    }

    public void setDeathCauseDataList(List<DeathData> deathCauseDataList) {
        this.deathCauseDataList = deathCauseDataList;
    }
}
