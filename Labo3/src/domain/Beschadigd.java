package domain;

public class Beschadigd implements StatusState {
    Product product;

    public Beschadigd(Product product){
        this.product = product;
    }

    public void verwijderen(){
        //remove product
        product.setState(product.getVerwijderdState());
    }

    public void uitlenen(){
        throw new IllegalArgumentException("Het product is geschadigd en kan niet uitgeleend worden");
    }

    public void herstellen(){
        product.isBeschadigd();
        product.setState(product.getUitleenbaarState());
    }

    public double terugbrengen(){
        throw new IllegalArgumentException("Het product is al teruggebracht");
    }
}



