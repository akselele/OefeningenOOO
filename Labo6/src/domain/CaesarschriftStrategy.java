package domain;

public class CaesarschriftStrategy implements GeheimschriftStrategy {

    public String encodeAlgoritme(String text) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        text = text.toLowerCase();
        String encodedtext = "";
        int letter = 0;
        //Ammount is hoeveel letters hij opschuift
        int ammount = 5;

        for (int i = 0; i < text.length(); i++) {
            char chr = text.charAt(i);

            for(int j = 0; j < alphabet.length(); j++){
                if (alphabet.charAt(j) == chr){
                    letter = j;
                    if(letter+ ammount > 25 ){
                        int aangepaste = letter + ammount - 26;
                        encodedtext += alphabet.charAt(aangepaste);
                    }else encodedtext += alphabet.charAt(letter+ammount);
                }
            }
            if(!alphabet.contains(String.valueOf(chr))){
                encodedtext += chr;
            }
        }
        return encodedtext;
    }


    public String decodeAlgoritme(String text) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        text = text.toLowerCase();
        String encodedtext = "";
        int letter = 0;
        int ammount = 5;

        for (int i = 0; i < text.length(); i++) {
            char chr = text.charAt(i);

            for(int j = 0; j < alphabet.length(); j++){
                if (alphabet.charAt(j) == chr){
                    letter = j;
                    if(letter- ammount < 0 ){
                        int aangepaste = letter - ammount + 26;
                        encodedtext += alphabet.charAt(aangepaste);
                    }else encodedtext += alphabet.charAt(letter-ammount);
                }
            }
            if(!alphabet.contains(String.valueOf(chr))){
                encodedtext += chr;
            }
        }
        return encodedtext;
    }
}
