package com.streamliners.task3.SubTask3;

public class Main {
    public static void main(String[] args) {
        TouristPlace tajMahal = new TouristPlace("Taj Mahal","10:00AM to 5:00PM",50);
        tajMahal.addFamousFor("Monument");
        tajMahal.rate(5);
        tajMahal.rate(2);
        System.out.println(tajMahal.starRating);
    }
}
