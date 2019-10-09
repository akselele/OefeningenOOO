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
    int id = 0;

    public Product(double prijs){
        Uitleenbaar = new Uitleenbaar(this);
        Verwijderd = new Verwijderd(this);
        Beschadigd = new Beschadigd(this);
        Uitgeleend = new Uitgeleend(this);
        this.prijs = prijs;


    }

    public void setUitgeleend(boolean uitgeleend) {
        this.uitgeleend = uitgeleend;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public void setBeschadigd(boolean beschadigd) {
        this.beschadigd = beschadigd;
    }

    public void setBeschadigd(StatusState beschadigd) {
        Beschadigd = beschadigd;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setState(StatusState state) {
        State = state;
    }

    public void setUitleenbaar(StatusState uitleenbaar) {
        if (isBeschadigd())
        {
            throw new DomainException("is beschadigd");
        }else {
            Uitleenbaar = uitleenbaar;
        }

    }
    public double getSchadevergoeding()
    {
        return prijs/3;
    }

    public void setVerwijderd(StatusState verwijderd) {
        Verwijderd = verwijderd;
    }

    public double getUitleenPrijs() {
        return prijs/5;
    }

    public int getId() {
        return id;
    }


    public void setUitgeleend(StatusState uitgeleend) {
        Uitgeleend = uitgeleend;
    }

    public boolean isBeschadigd() {
        return beschadigd;
    }

    public StatusState getBeschadigdState() {
        return Beschadigd;
    }

    public StatusState getUitleenbaarState() {
        return Uitleenbaar;
    }

    public StatusState getVerwijderdState() {
        return Verwijderd;
    }
    public StatusState getUitgeleendState()
    {
        return Uitgeleend;
    }

    public boolean getBeschikbaar() {
        if(uitgeleend)
        {
            return false;
        }
        else return true;
    }

    public void setBeschikbaar(boolean b) {
        this.uitgeleend= true;
    }
}
