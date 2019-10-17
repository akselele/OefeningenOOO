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
    int id = 0;


    public Product(double prijs){
        UitleenbaarState = new Uitleenbaar(this);
        VerwijderdState = new Verwijderd(this);
        BeschadigdState = new Beschadigd(this);
        UitgeleendState = new Uitgeleend(this);
        this.prijs = prijs;


    }

    public void verwijderen(){
        State.verwijderen();
    }

    public void setUitgeleend(boolean uitgeleend) {
        this.uitgeleend = uitgeleend;
    }
    public void verwijderen()
    {
        State.verwijderen();
    }
    public void uitlenen()
    {
        State.uitlenen();
    }
    public void herstellen()
    {
        State.herstellen();
    }
    public void terugbrengen()
    {
        State.terugbrengen();
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }




    public void setState(StatusState state) {
        State = state;
    }

    public StatusState getState() {
        return State;
    }

    public double getSchadevergoeding()
    {
        return prijs/3;
    }



    public double getUitleenPrijs() {
        return prijs/5;
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

    public int getId() {
        return id;
    }

}
