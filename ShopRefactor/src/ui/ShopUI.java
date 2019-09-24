package ui;

import domain.Game;
import domain.Movie;
import domain.Product;
import domain.ProductShop;

public class ShopUI {
    public static void main(String[] args) {
        Product movie1 = new Movie("Noa");
        Product game1 = new Game("the tale of dieterke");
        Product movie2 = new Movie("arlmkjf");

        ProductShop productShop = new ProductShop();
        productShop.addProduct(1,movie1);
        productShop.addProduct(2,movie2);
        productShop.addProduct(3,game1);
        System.out.println(productShop.showPrice(3,5));
        System.out.println(productShop.showProduct(1));
    }
}
