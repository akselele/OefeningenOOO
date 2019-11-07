package domain;

import java.util.ArrayList;
import java.util.Random;

public class Spel implements Subject {
    private ArrayList<Observer> observers;
    private int[] worp;


    public Spel() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(worp());
        }
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public int[] worp(){
        worp= new int[2];
        Random rd1 = new Random();
        int x = rd1.nextInt(6-1) + 1;
        Random rd2 = new Random();
        int y = rd1.nextInt(6-1) + 1;
        worp[0] = x;
        worp[1] = y;
        return worp;
    }
}
