package src;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Bank implements Subject {
    private HashMap<EventType, List<Observer>> observers;
    private HashMap<String, Rekening> rekeningen;
    private int totaal;

    public Bank() {
        observers = new HashMap<>();
        rekeningen = new HashMap<>();
        totaal = 0;
        for (EventType eventType: EventType.values())
        {
            observers.put(eventType, new ArrayList<>());
        }
    }




    @Override
    public void registerObserver(Observer o, EventType type) {
        type.addObserver(o);

    }

    @Override
    public void removeObserver(Observer o, EventType type) {
        type.getObservers().remove(o);
    }

    @Override
    public void notifyObserver(Rekening rekening, EventType type) {

        for (int i = 0; i < type.getObservers().size(); i++)
        {
            Observer observer = (Observer) type.getObservers().get(i);
            observer.update(rekening, totaal, LocalDate.now(), type);
        }
    }


    public void voegRekeningToe(Rekening rekening)
    {
        rekeningen.put(rekening.getNummer(), rekening);
        totaal++;
        notifyObserver(rekening, EventType.REKENING);
    }

    public void haalGeldAf(Rekening rekening, double hoeveel)
    {
        rekeningen.get(rekening.getNummer()).setSaldo(rekening.getSaldo()-hoeveel);
        notifyObserver(rekening, EventType.AFHALING);
    }

    public void stortGeld(Rekening rekening, double hoeveel)
    {
        rekeningen.get(rekening.getNummer()).setSaldo(rekening.getSaldo()+hoeveel);
        notifyObserver(rekening, EventType.STORTING);
    }





}
