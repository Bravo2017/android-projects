package com.dismas.imaya.touradvisor.constructors;

/**
 * Created by imaya on 12/8/16.
 */

public class MapAllConstructor {

    int geolocation_id;
    String location_name;
    String longitude, latitude;

    public int getId()
    {
        return geolocation_id;
    }
    public void setId(int geolocation_id)
    {
        this.geolocation_id = geolocation_id;
    }
    public String getLongitude()
    {
        return longitude;
    }
    public void setLongitude(String longitude)
    {
        this.longitude = longitude;
    }
    public String getLatitude()
    {
        return latitude;
    }
    public void setLatitude(String latitude)
    {
        this.latitude = latitude;
    }
    public String getName()
    {
        return location_name;
    }
    public void setName(String location_name)
    {
        this.location_name = location_name;
    }
}
