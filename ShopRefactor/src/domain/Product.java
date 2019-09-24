package domain;

public abstract class Product {
    private String Id, Naam;
    private char Type;


    public Product(String Id, String Naam,char Type){
        this.Naam = Naam;
        this.Id = Id;
    }

    public String getId() {
        return Id;
    }

    public String getNaam() {
        return Naam;
    }

    public char getType() {
        return Type;
    }
}
