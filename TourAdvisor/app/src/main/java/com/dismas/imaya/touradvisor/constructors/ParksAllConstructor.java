package com.dismas.imaya.touradvisor.constructors;

/**
 * Created by imaya on 12/9/16.
 */
public class ParksAllConstructor {
    int attraction_site_id;
    String location_name;
    String site_name, site_image, cost_per_day;
    String longitude, latitude, phone, email, interior_image, attraction_image, openinghrs, categories;

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
    public String getCost_per_day()
    {
        return cost_per_day;
    }
    public void setCost_per_day(String cost_per_day)
    {
        this.cost_per_day = cost_per_day;
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

    public String getPhone()
    {
        return phone;
    }
    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public String getInterior_image()
    {
        return interior_image;
    }
    public void setInterior_image(String interior_image) {
        this.interior_image = interior_image;
    }
    public String getAttraction_image()
    {
        return attraction_image;
    }
    public void setAttraction_image(String attraction_image) {
        this.attraction_image = attraction_image;
    }
    public String getOpeninghrs()
    {
        return openinghrs;
    }
    public void setOpeninghrs(String openinghrs)
    {
        this.openinghrs = openinghrs;
    }
    public String getCategories()
    {
        return categories;
    }
    public void setCategories(String categories)
    {
        this.categories = categories;
    }
}
