package ui;

import domain.*;

import java.io.*;
import java.util.*;

public class ShopUI {
    public static void main(String[] args) {
        Map<Integer,Product> p = new HashMap<>();
        File producten = new File("producten.txt");
        File producten2 = new File("producten2.txt");
        ProductShop productShop = new ProductShop();



//Het bestand inlezen en daarvan een hashmap maken en in de hashmap steken in productshop (zie productshop voor die functie)
//Voor elke nieuwe lijn doet het +1 voor het ID van het product

        try{
            int x = 1;
            Scanner sc = new Scanner(producten);
            Product product = null;
            while(sc.hasNextLine()){
                Scanner scLijn = new Scanner(sc.nextLine());
                scLijn.useDelimiter("-");
                String type = scLijn.next();
                String naam = scLijn.next();
                if(type.equalsIgnoreCase("Game")){
                    product = new Game(naam);
                }
                else if(type.equalsIgnoreCase("Movie")){
                    product = new Movie(naam);
                }
                p.put(x,product);
                x++;
            }
        } catch (FileNotFoundException e) {
            throw new DomainException("Fout bij het lezen van het bestand");
        }
        productShop.leesProducten(p);

        //Voor het uitschrijven van de map. De code om het alleen te doen wanneer het programma sluit heb ik gevonden op het internet
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            public void run() {
                try{
                    PrintWriter writer = new PrintWriter(producten2);
                    for(Map.Entry<Integer, Product> pr : productShop.getProducten().entrySet()){
                        writer.println(pr.getValue().getType() + "-" + pr.getValue().getNaam());
                    }
                    writer.close();
                } catch (FileNotFoundException e) {
                    throw new DomainException("Kon het bestand niet uitschrijven");
                }
            }
        }, "Shutdown-thread"));

        System.out.println(productShop.showPrice(1,5));
        System.out.println(productShop.showProduct(1));

    }
}
