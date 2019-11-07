package domain;

public class schermSpeler1 implements Observer, Display {
    private Subject scherm1;
    private int[] worp;


    public schermSpeler1(Subject schermSpeler1){
        this.scherm1 = schermSpeler1;
        schermSpeler1.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Worp: " + worp[0] + ", " + worp[1]);

    }

    @Override
    public void update(int[] worp) {
        this.worp = worp;
        display();
    }
}
