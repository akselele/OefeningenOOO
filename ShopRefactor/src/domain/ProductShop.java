package domain;

import java.util.ArrayList;

public class ProductShop {
    private ArrayList<Product> products;


    public ProductShop(){
        ArrayList products = new ArrayList();
    }

    public void addProduct(Product p){
        products.add(p);
    }

    public double berekenPrijs(int id){
        for(int i = 0; i < products.size(); i++){
            int idi = Integer.parseInt(products.get(i).getId());
            if(idi == id){
                Product p = products.get(i);
                if(p instanceof Game){

                }
                if(p instanceof Movie){

                }
            }
        }
    }
}
