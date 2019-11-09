package src;

public class Rekening {
    String nummer;
    double saldo;

    public Rekening(String nummer, double saldo)
    {
        this.nummer = nummer;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNummer() {
        return nummer;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
