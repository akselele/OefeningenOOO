package domain;

public class Verwijderd implements StatusState {
    Product product;

    public Verwijderd(Product product) {
        this.product = product;
    }

}
