package com.streamliners.task3.SubTask3;

import java.util.ArrayList;
import java.util.List;

public class TouristPlace {
    private String name;
    private String workingHour;
    private int entryTicketPrice;
    private int noOfRatings;
    float starRating;
    private List<String> famousFor;

    TouristPlace(String n, String w, int e){
        this.name = n;
        this.workingHour = w;
        this.entryTicketPrice = e;
        this.famousFor = new ArrayList<>();
        this.noOfRatings = 0;
        this.starRating = 0;
    }

    public void rate(int stars){
        starRating = starRating*noOfRatings + stars;
        noOfRatings++;
        starRating/=noOfRatings;
    }

    public TouristPlace addFamousFor(String s){
        famousFor.add(s);
        return this;
    }

    public boolean isPlaceOpen(){
        return true;
    }

}
