package com.streamliners.task3.SubTask1;

public class Main {
    public static void main(String[] args) {
        Product apple = new Product("Apple",100);
        Product apple1 = new Product("Apple",100);
        Product orange = new Product("Orange",80);

        if (apple.equals(apple1)) System.out.println("apple and apple1 are equal");
        else System.out.println("apple and apple1 are not equal");

        System.out.println(apple.toString());
        System.out.println(apple1.toString());
        System.out.println(orange.toString());

        SpecialProduct specialProduct = SpecialProduct.applyOffOnProduct(apple, 10);
        System.out.println(specialProduct.toString());
    }
}
