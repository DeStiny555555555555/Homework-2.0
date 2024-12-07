package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.Arrays;


public class ProductBasket {
    private final Product[] basket;
    private int count;

    public ProductBasket() {
        basket = new Product[5];
        count = 0;
    }

    public void addProduct(Product product) {
        if (count >= basket.length) {
            System.out.println("Корзина заполнена");
            return;
        }
        basket[count++] = product;
    }

    public int getTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < count; i++) {
            totalPrice = totalPrice + basket[i].getPriceProduct();
        }
        return totalPrice;
    }

    public void printProduct() {
        if (count == 0) {
            System.out.println("Корзина пустая");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(basket[i].getNameProduct() + " : " + basket[i].getPriceProduct());
        }
        System.out.println("Итого: " + getTotalPrice());
    }

    public void checkProductBasket(String name) {
        for (int i = 0; i < count; i++) {
            if (basket[i].getNameProduct().equals(name)) {
                System.out.println("Продукта с названием " + name + " есть в корзине.");
                return;
            }
        }
        System.out.println("Продукта с названием " + name + " нет в корзине.");
    }

    public void clearProduct() {
        for (int i = 0; i < count; i++) {
            basket[i] = null;
            count = 0;
        }
    }
}
