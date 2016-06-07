package com.dismas.imaya.info_parks;

import java.util.ArrayList;

/**
 * Created by imaya on 6/6/16.
 */
public class PlaceData {
    public static String[] placeNameArray = {"Aberdare", "Amboseli", "Arabuko", "Bogoria", "Buffalo", "Hells Gate", "Kakamega", "Lewa", "Maasai", "Marsabit", "Meru", "Mombasa", "Mt Kenya", "Mt Longonot", "Naivasha", "Nakuru", "Shaba", "Shimba", "Taita Hills", "Tsavo East", "Tsavo West", "Watamu Marine"};

    public static ArrayList<Place> placeList() {
        ArrayList<Place> list = new ArrayList<>();
        for (int i = 0; i < placeNameArray.length; i++) {
            Place place = new Place();
            place.name = placeNameArray[i];
            place.imageName = placeNameArray[i].replaceAll("\\s+", "").toLowerCase();
            if (i == 2 || i == 5) {
                place.isFav = true;
            }
            list.add(place);
        }
        return (list);
    }
}
