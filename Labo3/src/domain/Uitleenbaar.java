package domain;

public class Uitleenbaar implements StatusState {
    Product product;

    public Uitleenbaar(Product product){
        this.product = product;
    }

    public void verwijderen(){

    }

    public void uitlenen(){
    }

    public void herstellen(){

    }

    public void terugbrengen(){

    }
}
