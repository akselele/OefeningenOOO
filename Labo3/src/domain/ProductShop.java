package domain;

import java.util.*;

public class ProductShop {
    private Map<Integer,Product> products;


    public ProductShop(){
        this.products = new HashMap();
    }

  public void addProduct(Product product){
        products.put(product.getId(), product);
  }

  public Product showProduct(int id){
       return products.get(id);
  }

  /*public double showPrice(int id,int days){
       return products.get(id).getPrice(days);
  }*/
  public boolean isProductBeschikbaar(int id) {
      return products.get(id).getState().equals(products.get(id).getUitleenbaarState());
  }

  //Deze functie voegt de ingelezen producten in de map
  public void leesProducten(Map producten){
        this.products = producten;
  }

  //Return de map om het uit te kunnen schrijven
    public Map<Integer,Product> getProducten(){
        return products;
    }


    public String ToString(){
        String uit = " ";
        for(int i = 1; i < products.size()+1; i++){
          uit += products.get(i) + "\n\n";
        }
        return uit;
    }

    /*public Map<Integer,Product> sort(){
        List<Map.Entry<Integer,Product>> list = new LinkedList<Map.Entry<Integer, Product>>(products.entrySet());

        Collections.sort(list, new ComparatorByType());
        System.out.println(list);
        return null;
    }*/






}
