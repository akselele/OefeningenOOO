package domain;

public class Beschadigd implements StatusState {
    Product product;

    public Beschadigd(Product product){
        this.product = product;
    }

    public void verwijderen(){
        //remove product
        //
        //
        product.setState(product.getVerwijderdState());
    }

    public void uitlenen(){
        throw new IllegalArgumentException("het product is geschadigd en kan niet uitgeleend worden");
    }

    public void herstellen(){
        product.setBeschadigd(false);
        product.setState(product.getUitleenbaarState());
    }

    public void terugbrengen(){
        throw new IllegalArgumentException("het product is al teruggebracht");
    }
}



