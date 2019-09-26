package domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProductShopTest {
    ProductShop productShop;
    Product product1;
    Product product2;
    Product product3;


    @Before
    public void setUp(){
        product1 = new Movie("movie1");
        product2 = new Game("game1");
        product3 = new CD("cd1");
        productShop = new ProductShop();
        productShop.addProduct(product1);
        productShop.addProduct(product2);
        productShop.addProduct(product3);


    }

    @Test
    public void product_is_uitgeleend(){
        Assert.assertEquals(productShop.isProductBeschikbaar(1),true);
    }
}
