package alizinha.c4q.nyc.visualizingdatadotgov.models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    public List<String> getUniqueYearsForData() {
        Set<String> uniqueYears = new HashSet<>();

        for (DeathData deathData : deathCauseDataList) {
            String year = deathData.getYear();
            uniqueYears.add(year);
        }

        List<String> yearList = new ArrayList<>();
        yearList.addAll(uniqueYears);

        return yearList;
    }


    public List<String> getUniqueEthnicities() {
        Set<String> uniqueEthnicities = new HashSet<>();

        for (DeathData deathData : deathCauseDataList) {
            String ethnicity = deathData.getEthnicity();
            uniqueEthnicities.add(ethnicity);
        }

        List<String> ethnicityList = new ArrayList<>();
        ethnicityList.addAll(uniqueEthnicities);

        return ethnicityList;
    }


    public List<DeathData> getFilteredDeathData(String year, String ethnicity, String gender) {
        List<DeathData> filteredList = new ArrayList<>();

        for (DeathData deathData : deathCauseDataList) {
            if (deathData.getYear().equals(year) &&
                deathData.getEthnicity().equals(ethnicity) &&
                deathData.getGender().equals(gender)) {
                filteredList.add(deathData);
            }
        }
        return filteredList;
    }

}
