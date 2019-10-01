package ui;


import domain.VertalerContext;

import javax.accessibility.Accessible;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class VertaalSysteem extends JComponent implements Accessible {
    JFrame f;


    VertaalSysteem() {
        ArrayList<String> y = new ArrayList<>();
        String[] list ={"Caesar", "Spiegel"};
        String type ="";
        int x = JOptionPane.showOptionDialog(
                null, "Welke encryptiesysteem verkiest u", "Welke encryptiesysteem verkiest u", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, list, list[0]);
        if (x == 0)
        {
            type = "caesar";
        }
        else type = "spiegel";
        y.add(type);
        String[] list2 ={"encode", "decode"};
        int a = JOptionPane.showOptionDialog(
                null, "encode or decode", "encode or decode", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, list2, list2[0]);
        String encodeordecode ="";
        if (a == 0)
        {
            encodeordecode = "encode";
        }
        else encodeordecode = "decode";
        y.add(encodeordecode);
        VertalerContext ab = new VertalerContext(y.get(0), y.get(1));
        String m = JOptionPane.showInputDialog("enter the text");
        JOptionPane.showMessageDialog(null, ab.vertaal(m));

    }
    public static void main(String[] args) {
        new VertaalSysteem();
    }

}
