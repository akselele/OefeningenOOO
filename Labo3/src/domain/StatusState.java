package domain;


public interface StatusState {

    //throw exceptions as standard
    default void verwijderen(){
        throw new IllegalArgumentException("Verwijderen gaat niet");
    }
    default void uitlenen(){
        throw new IllegalArgumentException("Uitlenen gaat niet");
    }
    default void herstellen(){
        throw new IllegalArgumentException("Herstellen gaat niet");
    }
    default void terugbrengen(){
        throw new IllegalArgumentException("Terugbrengen gaat niet");
    }
}
