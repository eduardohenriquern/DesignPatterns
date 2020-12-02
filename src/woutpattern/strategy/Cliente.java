package woutpattern.strategy;

public class Cliente {

    private String nome;
    private String cpf;
    private ContaCorrente contaCorrente;
    private Cartao cartao;

    public Cliente(String n, String cpf, ContaCorrente cc, Cartao c){
        this.nome = n;
        this.cpf = cpf;
        this.contaCorrente = cc;
        this.cartao = c;
    }

    public ContaCorrente getContaCorrente() {
        return this.contaCorrente;
    }

    public Cartao getCartao() {
        return this.cartao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
