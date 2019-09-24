package domain;

public abstract class Product {
    private String Naam;

    public Product(String Naam){
        if(Naam.trim().isEmpty()){
            throw new DomainException("de naam kan niet leeg zijn");
        }
        this.Naam = Naam;

    }

    public String getNaam() {
        return Naam;
    }

    public abstract String getType();

    public abstract double getPrice(int days);

    public String toString(){
        return "Naam: " + Naam + "\nType: " + getType();
    }

}
