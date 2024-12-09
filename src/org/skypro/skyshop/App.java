package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Product product1 = new Product("Хлеб", 50);
        Product product2 = new Product("Молоко", 100);
        Product product3 = new Product("Соль", 70);
        Product product4 = new Product("Чай", 120);
        Product product5 = new Product("Рис", 40);
        Product product6 = new Product("Кофе", 170);
        ProductBasket basket = new ProductBasket();
        basket.addProduct(product1);
        basket.addProduct(product2);
        basket.addProduct(product3);
        basket.addProduct(product4);
        basket.addProduct(product5);
        basket.addProduct(product6);
        basket.printProduct();
        basket.checkProductBasket("Хлеб");
        basket.checkProductBasket("Гречка");
        basket.clearProduct();
        basket.printProduct();
        int price = basket.getTotalPrice();
        System.out.println("Стоимость пустой корзины " + price);
        basket.checkProductBasket("Соль");
    }
}
