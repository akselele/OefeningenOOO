package domain;

public class CaesarschriftStrategy implements GeheimschriftStrategy{
    @Override
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
                    encodedtext += alphabet.charAt(letter+ammount);
                }
            }
            if(!alphabet.contains(String.valueOf(chr))){
                encodedtext += chr;
            }
        }
        return encodedtext;
    }

    @Override
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
                    encodedtext += alphabet.charAt(letter-ammount);
                }
            }
            if(!alphabet.contains(String.valueOf(chr))){
                encodedtext += chr;
            }
        }
        return encodedtext;
    }
}
