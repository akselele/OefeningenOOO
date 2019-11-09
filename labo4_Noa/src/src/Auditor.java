package src;

import java.time.LocalDate;

public class Auditor implements Observer, Display {
    Rekening rekening;
    LocalDate localDate;

    public Auditor()
    {
        rekening = null;
        localDate = null;
    }

    @Override
    public void display() {
        System.out.println("Nieuwe rekening geopend op datum "+ localDate + " met nummer " + rekening.getNummer() + " en saldo " + rekening.getSaldo());

    }


    @Override
    public void update(Rekening rekening, int totaal, LocalDate datum, EventType type) {
        this.rekening = rekening;
        this.localDate = datum;
        display();
    }
}
