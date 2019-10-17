package domain;

public class Uitgeleend implements StatusState {
    Product product;

    public Uitgeleend(Product product){
        this.product = product;
    }

    public double terugbrengen(){
        double prijs = 0;
        if(product.isBeschadigd()){
            //reken extra aan voor schade + produt op beschadigd
            prijs += product.getUitleenPrijs() + product.getSchadevergoeding();
            product.setUitgeleend(false);
            product.setState(product.getBeschadigdState());
        }else{
            product.setUitgeleend(false);
            //reken normale prijs aan + product uitleenbaar
            prijs += product.getUitleenPrijs();
            product.setState(product.getUitleenbaarState());
        }
        return prijs;
    }
}
