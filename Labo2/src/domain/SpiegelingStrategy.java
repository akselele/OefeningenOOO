package domain;

public class SpiegelingStrategy implements GeheimschriftStrategy {



    @Override
    public String encodeAlgoritme(String text) {

        String reverseText = "";
        for(int i = text.length() -1; i >= 0; i--){
            reverseText += text.charAt(i);
        }
        return reverseText;
    }


    @Override
    public String decodeAlgoritme(String text){
       return encodeAlgoritme(text);
    }



}
