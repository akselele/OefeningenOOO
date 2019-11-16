package domain;

import java.util.ArrayList;
import java.util.List;

public class Dice {
    private int throwdice()
    {
        return (int)(Math.random()*6+1);
    }
}
