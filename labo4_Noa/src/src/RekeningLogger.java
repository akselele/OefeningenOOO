package src;

import java.time.LocalDate;

public class RekeningLogger implements Observer, Display{
    Rekening rekening;
    int totaal;
    EventType type;

    public RekeningLogger()
    {
        rekening = null;
        totaal = 0;
        type = null;
    }

    @Override
    public void display() {
        switch (type)
        {
            case AFHALING:
                System.out.println("afgehaald --> Rekeningn: " + rekening.getNummer() + " nieuw saldo: " + rekening.getSaldo());
                break;
            case REKENING:
                System.out.println("Rekening toegevoegd --> Rekeningn: " + rekening.getNummer() + " aantal rekeningen: " + totaal);
                break;
            case STORTING:
                System.out.println("gestort --> Rekeningn: " + rekening.getNummer() + " nieuw saldo: " + rekening.getSaldo());
                break;

        }

    }


    @Override
    public void update(Rekening rekening, int totaal, LocalDate datum, EventType type) {
        this.rekening = rekening;
        this.totaal = totaal;
        this.type = type;
        display();
    }
}
