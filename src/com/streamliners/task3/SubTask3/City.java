package com.streamliners.task3.SubTask3;

import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    private String state;
    private List<TouristPlace> touristPlaces;

    City(String n,String s){
        this.name = n;
        this.state = s;
        touristPlaces = new ArrayList<>();
    }
}
