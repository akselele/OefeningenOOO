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
        product.setState(product.getUitgeleendState());
    }

}
