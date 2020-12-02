package com.eduardohenrique.strategy;

import woutpattern.strategy.Cliente;
import woutpattern.strategy.Item;

import java.util.LinkedList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Item> itens;
    private double precoTotal;

    public Pedido(Cliente c){
        this.cliente = c;
        this.itens = new LinkedList<Item>();
        this.precoTotal = 0;
    }

    public void realizarPagamento(PagamentoStrategy formaDePagamento){
        formaDePagamento.pagar(this.cliente, this.precoTotal);
    }

    public void addItem(Item item){
        this.itens.add(item);
        this.precoTotal+=item.getPreco();
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
            System.out.println(itens.toString());
        }
    }

}
