package woutpattern.strategy;

import java.util.LinkedList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Item> itens;
    private double precoTotal;

    public Pedido(Cliente c){
        this.cliente = c;
        this.itens = new LinkedList<Item>();
    }

    public void realizarPagamento(String forma){
        // Uma forma elegante é fazer com switch, mas ainda é errada
        if(forma.equals("débito")){
            cliente.getContaCorrente().debitar(this.precoTotal);
            System.out.println("pagamento em débito realizado!");
        } else if(forma.equals("crédito")){
            cliente.getCartao().acrescentarNaFatura(this.precoTotal);
        } else if(forma.equals("boleto")){
            //this.gerarBoleto();
        }
    }

    public void addItem(Item item){
        this.itens.add(item);
    }

    public void removerItem(Item item){
        if(!itens.isEmpty()) {
            itens.remove(item);
        } else {
            System.out.println("Lista de itens vazia!");
        }
    }

    public void exibirItens(){
        for (Item it : this.itens) {
            System.out.println(it);
        }
    }
}
