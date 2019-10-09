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


    }

    public void setBeschadigd(boolean beschadigd) {
        this.beschadigd = beschadigd;
    }

    public void setBeschadigd(StatusState beschadigd) {
        Beschadigd = beschadigd;
    }

    public void setState(StatusState state) {
        State = state;
    }

    public void setUitgeleend(StatusState uitgeleend) {
        Uitgeleend = uitgeleend;
    }

    public void setUitgeleend(boolean uitgeleend) {
        this.uitgeleend = uitgeleend;
    }

    public void setUitleenbaar(StatusState uitleenbaar) {
        Uitleenbaar = uitleenbaar;
    }

    public void setVerwijderd(StatusState verwijderd) {
        Verwijderd = verwijderd;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public double getPrijs() {
        return prijs;
    }

    public StatusState getUitleenbaarState() {
        return Uitleenbaar;
    }

    public StatusState getVerwijderdState() {
        return Verwijderd;
    }

    public StatusState getBeschadigdState() {
        return Beschadigd;
    }

    public StatusState getUitgeleendState() {
        return Uitgeleend;
    }

    public StatusState getState() {
        return State;
    }

    public boolean isUitgeleend() {
        return uitgeleend;
    }

    public boolean isBeschadigd() {
        return beschadigd;
    }
}
