package domain;


public interface StatusState {

    //throw exceptions as standard
    public void verwijderen();
    public void uitlenen();
    void herstellen();
    void terugbrengen();
}
