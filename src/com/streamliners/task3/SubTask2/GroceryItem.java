package com.streamliners.task3.SubTask2;

public class GroceryItem {
    private String mname;
    private int mpriceperkg;

    GroceryItem(String name,int priceperkg){
        this.mname = name;
        this.mpriceperkg = priceperkg;
    }

    public String getMname(){
        return mname;
    }

    public int getMpriceperkg(){
        return mpriceperkg;
    }
}
