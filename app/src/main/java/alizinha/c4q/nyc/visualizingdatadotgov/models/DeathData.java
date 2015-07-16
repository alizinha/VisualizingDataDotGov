package alizinha.c4q.nyc.visualizingdatadotgov.models;

/**
 * Created by c4q-Allison on 7/15/15.
 */
public class DeathData {

    private String year;
    private String ethnicity;
    private String gender;
    private String cause;
    private int deathCount;
    private int deathPercent;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public int getDeathCount() {
        return deathCount;
    }

    public void setDeathCount(int deathCount) {
        this.deathCount = deathCount;
    }

    public int getDeathPercent() {
        return deathPercent;
    }

    public void setDeathPercent(int deathPercent) {
        this.deathPercent = deathPercent;
    }
}
