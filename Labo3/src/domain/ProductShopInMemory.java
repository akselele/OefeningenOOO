package domain;

import java.util.*;

public class ProductShopInMemory {

    private List<Product> products;

    public ProductShopInMemory(){
        this.products = new ArrayList<>();
        Product product = new Product(10);
        products.add(product);
    }

    public void addproduct(Product p){
        p.setBeschikbaar(true);
        products.add(p);

    }

    public void removeProductAfterRun(){
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

  public List<Product> getAll(){
        return products;
  }

  //during runtime deleted products stay in the list but get deleted when you exit the application



}
