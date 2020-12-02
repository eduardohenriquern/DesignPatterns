package woutpattern.strategy;

public class Fatura {
    private double total;

    public Fatura(){
        this.total = 0;
    }

    public void addQuantia(double quantia){
        this.total+=quantia;
    }

    public double getTotal(){
        return this.total;
    }
}
