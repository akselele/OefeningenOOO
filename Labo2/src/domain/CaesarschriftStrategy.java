package domain;

public class CaesarschriftStrategy implements GeheimschriftStrategy{
    String alfabet ="abcdefghijklmnopqrstuvwxyz";
    String uitkomst;

    @Override
    public String algoritme(String text) {
        text = text.toLowerCase();
        for(int i =1; i < text.length(); i++){
            for(int x = 0; x < alfabet.length(); x++){
                if(text.charAt(i) == alfabet.charAt(x)){
                    if(x>3){
                        x = x + 23 - 26;
                    }
                    uitkomst += alfabet.charAt(x);
                }
            }
        }
        System.out.println(uitkomst);
        return uitkomst;
    }
}
