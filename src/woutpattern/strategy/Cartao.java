package woutpattern.strategy;

public class Cartao {
    private TipoCartao tipo;
    private String numero;
    private Fatura fatura;

    public Cartao(String num, TipoCartao t){
        this.numero = num;
        this.tipo = t;
        fatura = new Fatura();
    }

    public void acrescentarNaFatura(double quantia){
        fatura.addQuantia(quantia);
        consultarFatura();
    }

    public void consultarFatura(){
        System.out.println("Total da Fatura: " + fatura.getTotal());
    }
}
