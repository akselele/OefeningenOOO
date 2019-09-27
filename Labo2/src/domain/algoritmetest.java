package domain;

public class algoritmetest {
    public static void main(String[] args) {

       // SpiegelingStrategy spiegelingStrategy = new SpiegelingStrategy();
        //System.out.println(spiegelingStrategy.algoritme("Noa is lol"));

        CaesarschriftStrategy caesarschriftStrategy = new CaesarschriftStrategy();
        System.out.println(caesarschriftStrategy.encodeAlgoritme("test!"));
        System.out.println(caesarschriftStrategy.decodeAlgoritme("uftu!"));

    }




}
