package domain;

public abstract class Product {
    private String Naam;
    private boolean beschikbaar;

    public Product(String Naam){
        if(Naam.trim().isEmpty()){
            throw new DomainException("de naam kan niet leeg zijn");
        }
        this.Naam = Naam;
        this.beschikbaar = true;
    }

    public String getNaam() {
        return Naam;
    }

    public abstract String getType();

    public abstract double getPrice(int days);
    public boolean getBeschikbaar(){
        return this.beschikbaar;
    }

    public void setBeschikbaar(boolean beschikbaar) {
        this.beschikbaar = beschikbaar;
    }


    public String toString(){
        return "Naam: " + Naam + "\nType: " + getType();
    }

}
