package domain;

public class Turn {
    private Player player;
    private int a, b, previous, current;

    public Turn(Player player, int a, int b, int previous)
    {
        this.player = player;
        this.a = a;
        this.b = b;
        this.previous = previous;
        this.current = calculate();
    }
    private int calculate()
    {
        int result;
        if (a == b)
        {
            result = (a + b)*2;
        }
        else result = a+b;
        if (previous == result)
        {
            result += 5;
        }
        return result;

    }

    public int getCurrent() {
        return current;
    }

    public String toString()
    {
        return  "Speler " + player.getNaam() + " werpt " + a + " en " + b + " - score " + current;
    }


}
