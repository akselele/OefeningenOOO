package domain;

import java.util.Arrays;

public class CypherAdapter implements GeheimschriftStrategy {
    private RandomCypher randomCypher;

    public CypherAdapter(){
        this.randomCypher = new RandomCypher();
    }


    @Override
    public String encodeAlgoritme(String text) {

        return String.valueOf(randomCypher.encypher(text.toCharArray()));


    }

    @Override
    public String decodeAlgoritme(String text) {
        return String.valueOf(randomCypher.decypher(text.toCharArray()));
    }
}
