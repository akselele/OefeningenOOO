package ui;


import domain.*;

import javax.accessibility.Accessible;
import javax.swing.*;
import java.util.ArrayList;

public class VertaalSysteem extends JComponent implements Accessible {
    JFrame f;


    VertaalSysteem() {

        VertalerContext context = new VertalerContext();
        ArrayList<String> y = new ArrayList<>();
        String[] list ={"caesarschrift", "spiegelschrift","cypherschrift"};
        String type ="";
        int x = JOptionPane.showOptionDialog(
                null, "Welke encryptiesysteem verkiest u", "Welke encryptiesysteem verkiest u", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, list, list[0]);
        System.out.println(x);
        System.out.println(list[x]);

       StrategyFactory strategyFactory = new StrategyFactory();
       context.setGeheimschriftStrategy(strategyFactory.createStrategy(list[x]));


        if (x == 0)
        {
            type = "caesar";
        }
        else type = "spiegel";
        y.add(type);
        String[] list2 ={"encode", "decode"};
        int a = JOptionPane.showOptionDialog(
                null, "encode or decode", "encode or decode", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, list2, list2[0]);
        String encodeordecode;
        if (a == 0)
        {
            encodeordecode = "encode";
        }
        else encodeordecode = "decode";
        y.add(encodeordecode);

        System.out.println(y.get(0) + "    " + y.get(1));





        //context.setGeheimschriftStrategy(y.get(0));
        //VertalerContext ab = new VertalerContext(y.get(0), y.get(1));
        String m = JOptionPane.showInputDialog("enter the text");
        //JOptionPane.showMessageDialog(null, ab.vertaal(m));

        if(y.get(1).equals("encode")){
            context.encode(m);
        }else context.decode(m);

    }
    public static void main(String[] args) {
        new VertaalSysteem();
    }

}
