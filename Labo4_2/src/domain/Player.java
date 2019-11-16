package domain;

public class Player {
    private int playerid;
    private String naam;
    private boolean isCurrent;

    public Player(int playerid, String naam)
    {
        this.playerid = playerid;
        this.naam = naam;
        this.isCurrent = false;
    }

    public void setCurrent(boolean current) {
        isCurrent = current;
    }

    public int getPlayerid() {
        return playerid;
    }

    public String getNaam() {
        return naam;
    }

    public boolean isCurrent()
    {
        return this.isCurrent;
    }

    public String toString() {
        return "Speler: " + naam + " nr: " + playerid;
    }
}
