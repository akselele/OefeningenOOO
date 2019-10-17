package db;

import domain.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDb {
    List<Product> products;

    public ProductDb(){
        products = new ArrayList<>();
    }

    public void addAlltoDb(List<Product> listInMemory){
        if(listInMemory.isEmpty()){
            throw new IllegalArgumentException("the list you want to put into the database is empty");
        }
        products.addAll(listInMemory);
    }
}
