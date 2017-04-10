package data.science.com.florensis;

/**
 * Created by tune on 27/02/2017.
 */

public class Data {

    private String greenhouse, bedID;

    public Data(String greenhouse, String bedID){
        this.setGreenhouse(greenhouse);
        this.setBedID(bedID);
    }

    public String getGreenhouse() {
        return greenhouse;
    }

    public void setGreenhouse(String greenhouse) {
        this.greenhouse = greenhouse;
    }

    public String getBedID() {
        return bedID;
    }

    public void setBedID(String bedID) {
        this.bedID = bedID;
    }
}
