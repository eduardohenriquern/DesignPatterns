package woutpattern.strategy;

public class ContaCorrente {
    private String numero;
    private double saldo;

    public ContaCorrente(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void debitar(double quantia) {
        if (getSaldo() > 0) {
            this.saldo -= quantia;
            System.out.println("Saldo atual: "+getSaldo());
        } else {
            // Poderia lançar uma exceção SaldoInsuficienteException()
            System.out.println("Saldo insuficiente!");
        }
    }

    public void creditar(double quantia) {
        this.saldo += quantia;
    }
}