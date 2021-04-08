package com.streamliners.task3.SubTask2;

import java.util.ArrayList;

public class Cart {
    private ArrayList<GroceryCartItem> cartItems;
    private float totalAmount;

    Cart(){
        cartItems = new ArrayList<>();
        int totalAmount = 0;
    }

    public Cart add(GroceryCartItem item){
        cartItems.add(item);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cart{" +
                "\n\tgroceryCartItems = [");
        for (int i=0;i< cartItems.size();i++){
            sb.append("\n" + cartItems.get(i) + ",");
            this.totalAmount+= cartItems.get(i).getPrice();
        }
        sb.append("\n],\ntotal amount = ₹" + this.totalAmount + "\n}");
        return sb.toString();
    }
}
