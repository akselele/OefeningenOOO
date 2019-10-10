package domain;

public class Product {
    private StatusState UitleenbaarState;
    private StatusState VerwijderdState;
    private StatusState BeschadigdState;
    private StatusState UitgeleendState;
    private StatusState State = UitleenbaarState;
    private boolean uitgeleend = false;
    private double prijs;
    private boolean beschadigd = false;

    public Product(double prijs){
        UitleenbaarState = new Uitleenbaar(this);
        VerwijderdState = new Verwijderd(this);
        BeschadigdState = new Beschadigd(this);
        UitgeleendState = new Uitgeleend(this);
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
        BeschadigdState = beschadigd;
    }

    public void setState(StatusState state) {
        State = state;
    }

    public void setUitleenbaar(StatusState uitleenbaar) {
        if (isBeschadigd()) {
            throw new DomainException("is beschadigd");
        }else {
            UitleenbaarState = uitleenbaar;
        }

    }
    public double getSchadevergoeding()
    {
        return prijs/3;
    }

    public void setVerwijderd(StatusState verwijderd) {
        VerwijderdState = verwijderd;
    }

    public double getUitleenPrijs() {
        return prijs/5;
    }

    public void setUitgeleend(StatusState uitgeleend) {
        UitgeleendState = uitgeleend;
    }

    public boolean isBeschadigd() {
        return beschadigd;
    }

    public StatusState getBeschadigdState() {
        return BeschadigdState;
    }

    public StatusState getUitleenbaarState() {
        return UitleenbaarState;
    }

    public StatusState getVerwijderdState() {
        return VerwijderdState;
    }
    public StatusState getUitgeleendState()
    {
        return UitgeleendState;
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
