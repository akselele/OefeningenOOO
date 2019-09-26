package domain;

public class CD extends Product {


    public CD(String Naam) {
        super(Naam);
    }

    @Override
    public String getType() {
        return "CD";
    }

    @Override
    public double getPrice(int days) {
        return 1.5 * days;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
