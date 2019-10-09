package domain;

public class Uitgeleend implements StatusState {
    Product product;

    public Uitgeleend(Product product){
        this.product = product;
    }

    public void verwijderen(){
        throw new IllegalArgumentException("je kan dit product niet verwijderen, het is uitgeleend");
    }

    public void uitlenen(){
        throw new IllegalArgumentException("product is al uitgeleend");
    }

    public void herstellen(){
        throw new IllegalArgumentException("je kan dit product niet herstellen");
    }

    public void terugbrengen(){
        if(product.isBeschadigd()){
            //reken extra aan
            product.setUitgeleend(false);
            product.setState(product.getBeschadigdState());
        }else{
            product.setUitgeleend(false);
            //reken prijs aan
            product.setState(product.getUitleenbaarState());
        }

    }
}
