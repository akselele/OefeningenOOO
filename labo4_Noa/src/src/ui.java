package src;

public class ui {

    public static void main(String[] args) {
        Bank bank = new Bank();
        Rekening rekening = new Rekening("542", 500);
        Auditor auditor = new Auditor();
        RekeningLogger rekeningLogger = new RekeningLogger();
        bank.registerObserver(auditor, EventType.REKENING);
        bank.registerObserver(rekeningLogger, EventType.REKENING);
        bank.registerObserver(rekeningLogger, EventType.AFHALING);
        bank.registerObserver(rekeningLogger, EventType.STORTING);
        bank.voegRekeningToe(rekening);
        bank.haalGeldAf(rekening, 40);
        bank.stortGeld(rekening, 50);
    }
}
