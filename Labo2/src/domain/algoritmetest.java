package domain;

public class algoritmetest {
    public static void main(String[] args) {

       // SpiegelingStrategy spiegelingStrategy = new SpiegelingStrategy();
        //System.out.println(spiegelingStrategy.algoritme("Noa is lol"));

        CaesarschriftStrategy caesarschriftStrategy = new CaesarschriftStrategy();
        System.out.println(caesarschriftStrategy.encodeAlgoritme("dit is zeer geheim!"));
        System.out.println(caesarschriftStrategy.decodeAlgoritme("iny nx ejjw ljmjnr!"));

    }




}
