package domain;

import java.util.ArrayList;
import java.util.List;

public class Dice {
    public int throwdice()
    {
        return (int)(Math.random()*6+1);
    }
}
