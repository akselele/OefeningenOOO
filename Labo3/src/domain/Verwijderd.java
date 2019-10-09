package domain;

public class Verwijderd implements StatusState {
    Product product;

    public Verwijderd(Product product) {
        this.product = product;
    }

    public void verwijderen() {
        throw new IllegalArgumentException("Product is al verwijderd");
    }

    public void uitlenen() {
        throw new IllegalArgumentException("Product is verwijderd");
    }

    public void herstellen() {
        throw new IllegalArgumentException("Product is verwijderd");
    }

    public void terugbrengen() {
        throw new IllegalArgumentException("Product is verwijderd");
    }
}
