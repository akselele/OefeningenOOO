package domain;

public class NoaSchrift implements GeheimschriftStrategy {
    @Override
    public String encodeAlgoritme(String text) {
        String result = "";
        for(int i = 0; i < text.length(); i+=3){

            result += "NOA";
        }
        return result;
    }

    @Override
    public String decodeAlgoritme(String text) {
        String result = "";
        for(int i = 0; i < text.length(); i+=3){
            result += "NOA";
        }
        return result;
    }
}
