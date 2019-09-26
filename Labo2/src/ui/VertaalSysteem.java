package ui;


import javax.accessibility.Accessible;
import javax.swing.*;

public class VertaalSysteem extends JComponent implements Accessible {
    JFrame f;

    VertaalSysteem() {
        this.f = new JFrame();
        JOptionPane.showMessageDialog(f, "Wie dit leest is zot");
    }
    public static void main(String[] args) {
        new VertaalSysteem();
    }

}
