package domain;

import java.util.*;

public class ProductShop {

    private List<Product> products;

    public ProductShop(){
        this.products = new ArrayList<>();
        Product product = new Product(10);
        products.add(product);
    }

    public void addproduct(Product p){
        products.add(p);
    }

    public void removeProduct(){
        for(Product p : products){
            if(p.getState().equals(p.getVerwijderdState())){
                products.remove(p);
            }
        }
    }

  public Product showProduct(int id){
       return products.get(id);
  }

  public boolean isProductBeschikbaar(int id) {
      for(Product p : products){
         if( p.getId() == id && p.getState().equals(p.getUitleenbaarState())){
             return true;
         }
      }
      return false;
  }

  //during runtime deleted products stay in the list but get deleted when you exit the application
    // different display for the fine when a product is damaged
    //defaults in interface so code in states does not have to be written everytime


}
