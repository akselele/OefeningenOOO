package domain;

public class Game extends Product {
    public Game(String Naam) {
        super(Naam);
    }

    @Override
    public String getType() {
        return "Game";
    }

    @Override
    public double getPrice(int days) {
        double price = 0;
        price = days * 3;
        return price;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
