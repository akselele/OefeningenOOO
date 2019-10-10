package domain;

public class Uitleenbaar implements StatusState {
    private Product product;

    public Uitleenbaar(Product product){
        this.product = product;
    }

    public void verwijderen(){
        product.setState(product.getVerwijderdState());
    }

    public void uitlenen(){
        product.setUitgeleend(true);
        product.setState(product.getUitleenbaarState());
    }

    public void herstellen(){
        throw new IllegalArgumentException("dit product is niet beschadigd en kan niet hersteld worden");
    }

    public double terugbrengen(){
        throw new IllegalArgumentException("dit product is niet uitgeleend dus kan je het niet terugbrengen");
    }
}
