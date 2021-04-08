package com.streamliners.task3.SubTask2;

public class GroceryCartItem extends GroceryItem{
    private float mprice;
    private float mquantity;

    GroceryCartItem(String name, int priceperkg) {
        super(name, priceperkg);
    }

    @Override
    public String toString() {
        return String.format(this.getMname() + "(₹" + this.getMpriceperkg() + "X" + this.mquantity + "kg) = ₹" + this.getMpriceperkg()*this.mquantity);
    }

    public float getPrice(){
        return mprice;
    }

    public float getMquantity(){
        return mquantity;
    }

    private static float extractQuantity(String quantityStr){
        String[] arr = quantityStr.split(" ");
        float front = Integer.parseInt(arr[0].replace("kg",""));
        float dec = Integer.parseInt(arr[1].replace("g",""));
        float qty = front + dec/1000;

        return qty;
    }

    public static GroceryCartItem createNew(GroceryItem item, String quantityStr){
        GroceryCartItem cartItem = new GroceryCartItem(item.getMname(),item.getMpriceperkg());
        cartItem.mquantity = extractQuantity(quantityStr);
        cartItem.mprice = item.getMpriceperkg() * cartItem.mquantity;
        return cartItem;
    }





}
