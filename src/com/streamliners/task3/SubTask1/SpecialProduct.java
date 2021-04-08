package com.streamliners.task3.SubTask1;

public class SpecialProduct extends Product{
    int regularPrice;
    int percentageOff;

    private SpecialProduct(String name, int price) {
        super(name, price);
    }

    public static SpecialProduct applyOffOnProduct(Product product,int mpercentageOff){
        int discountedPrice = product.getPrice() - product.getPrice()*mpercentageOff/100;
        SpecialProduct specialProduct = new SpecialProduct(product.getName(),discountedPrice);

        specialProduct.regularPrice = product.getPrice();
        specialProduct.percentageOff = mpercentageOff;
        return specialProduct;
    }

    @Override
    public String toString() {
        return String.format("Name : %s @ Rs. %d, Regular Price : Rs. %d with Percentage Off : %d", this.getName(), this.getPrice(), regularPrice, percentageOff);
    }

}
