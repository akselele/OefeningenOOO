package domain;

public enum StrategyEnum {
    CAESARSCHRIFT ("caesarschrift","domain.CaesarschriftStrategy"),
    SPIEGELING ("spiegelschrift","domain.SpiegelingStrategy"),
    RANDOMCYPHER("randomcypher","domain.CypherAdapter"),
    NOASCHRIFT("noaschrift","domain.NoaSchrift");


    private final String name;
    private final String klasseNaam;

    StrategyEnum(String name, String klasseNaam){
        this.name = name;
        this.klasseNaam = klasseNaam;
    }

    public String getKlasseNaam() {
        return klasseNaam;
    }

    public String getName() {
        return name;
    }
    
}
