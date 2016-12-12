package com.dismas.imaya.touradvisor.constructors;

/**
 * Created by imaya on 12/9/16.
 */
public class ParksAllConstructor {
    int attraction_site_id;
    String location_name;
    String site_name, site_image;

    public int getAttraction_site_id()
    {
        return attraction_site_id;
    }
    public void setAttraction_site_id(int attraction_site_id)
    {
        this.attraction_site_id = attraction_site_id;
    }
    public String getSite_name()
    {
        return site_name;
    }
    public void setSite_name(String site_name)
    {
        this.site_name = site_name;
    }
    public String getSite_image()
    {
        return site_image;
    }
    public void setSite_image(String site_image)
    {
        this.site_image = site_image;
    }
    public String getLocationName()
    {
        return location_name;
    }
    public void setLocation_name(String location_name)
    {
        this.location_name = location_name;
    }
}
