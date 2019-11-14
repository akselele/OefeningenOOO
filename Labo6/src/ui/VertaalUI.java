package ui;

import domain.StrategyFactory;
import domain.VertalerContext;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javax.accessibility.Accessible;
import javax.swing.*;
import java.util.List;

public class VertaalUI {
    VertaalUI(){
        VertalerContext context = new VertalerContext();
        StrategyFactory strategyFactory = new StrategyFactory();
        String result;

        String [] list = context.getTaalLijst();
        int x = JOptionPane.showOptionDialog(null,"Welk encryptiesysteem verkiest u","Keuze encryptiesysteem",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,list,list[0]);
        context.setGeheimschriftStrategy(strategyFactory.createStrategy(list[x]));


        String[] list2 ={"encode", "decode"};
        int y = JOptionPane.showOptionDialog(null,"Encode of decode?","Keuze encode of decode",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,list2,list2[0]);
        String message = JOptionPane.showInputDialog("enter the text: ");
        if(y == 0){
            result = context.encode(message);
        }else result = context.decode(message);

        JOptionPane.showMessageDialog(null,result);
    }
}
