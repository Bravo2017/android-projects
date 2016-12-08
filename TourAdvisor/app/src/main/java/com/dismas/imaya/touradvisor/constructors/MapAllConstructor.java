package com.dismas.imaya.touradvisor.constructors;

/**
 * Created by imaya on 12/8/16.
 */

public class MapAllConstructor {

    int geolocation_id;
    String location_name;
    Double longitude, latitude;

    public int getId()
    {
        return geolocation_id;
    }
    public void setId(int geolocation_id)
    {
        this.geolocation_id = geolocation_id;
    }
    public Double getLongitude()
    {
        return longitude;
    }
    public void setLongitude(Double longitude)
    {
        this.longitude = longitude;
    }
    public Double getLatitude()
    {
        return latitude;
    }
    public void setLatitude(Double latitude)
    {
        this.latitude = latitude;
    }
    public String getName()
    {
        return location_name;
    }
    public void setName(String Name)
    {
        this.location_name = location_name;
    }
}
