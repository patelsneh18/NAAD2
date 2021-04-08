package com.streamliners.task3.SubTask2;

public class Main {
    public static void main(String[] args) {
        GroceryItem rice = new GroceryItem("Rice",50);
        GroceryItem wheat = new GroceryItem("Wheat",30);
        GroceryItem sugar = new GroceryItem("Sugar",60);
        GroceryItem oats = new GroceryItem("Oats",65);
        Cart cart = new Cart();
        cart.add(GroceryCartItem.createNew(wheat, "12kg 750g"))
                .add(GroceryCartItem.createNew(sugar,"3kg 0g"))
                .add(GroceryCartItem.createNew(oats,"0kg 750g"))
                .add(GroceryCartItem.createNew(rice, "3kg 0g"));

        System.out.println(cart.toString());
    }
}
