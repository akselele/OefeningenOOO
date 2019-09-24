package domain;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ProductShop {
    private Map<Integer,Product> products;


    public ProductShop(){
        this.products = new HashMap();
    }

  public void addProduct(int id,Product product){
        products.put(id,product);
  }

  public Product showProduct(int id){
       return products.get(id);
  }

  public double showPrice(int id,int days){
       return products.get(id).getPrice(days);
  }


}
