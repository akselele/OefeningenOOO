package domain;


public interface StatusState {

    //throw exceptions as standard
    void verwijderen();
    void uitlenen();
    void herstellen();
    double terugbrengen();
}
