package domain;

public class Product {
    private StatusState Uitleenbaar;
    private StatusState Verwijderd;
    private StatusState Beschadigd;
    private StatusState Uitgeleend;
    private StatusState State = Uitleenbaar;
    private boolean uitgeleend = false;
    private double prijs;
    private boolean beschadigd = false;

    public Product(double prijs){

    }


}
