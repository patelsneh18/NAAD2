package com.streamliners.task3.SubTask1;

public class Product {
    private String name;
    private int price;
    //Empty Constructor
    Product(){

    }

    Product(String n,int p){
        this.name = n;
        this.price = p;
    }

    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        Product product = (Product) obj;
        return this.name.equals(product.getName());
    }

    @Override
    public String toString() {
        return String.format("Name : %s @ Rs. %d", name, price);
    }
}
