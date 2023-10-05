package ru.GeekBrains.HomeWork3;

import java.util.Arrays;

public class Basket {
    //3)Создать класс Basket, содержащий массив купленных товаров
    String name;
    private Product[] purchasedProducts;

    public Basket(Product[] purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }


    public Product[] getPurchasedProducts() {
        return purchasedProducts;
    }

    public void setPurchasedProducts(Product[] purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }

    @Override
    public String toString() {
        return "Basket [purchasedProducts=" + Arrays.toString(purchasedProducts) + "]";
    }






