package com.eduardohenrique.decorator;

import java.util.LinkedList;
import java.util.List;

public class Sorveteria {
    private List<Sorvete> pedidos;

    public Sorveteria() {
        this.pedidos = new LinkedList<>();
    }

    public void addSorvete(Sorvete sorvete){
        this.pedidos.add(sorvete);
    }

    public void mostrarPedido(){
        String pedido = "Seu pedido está pronto! \n";
        for(Sorvete sorvete: this.pedidos){
            pedido = pedido.concat(sorvete.getComplemento());
        }
        System.out.println(pedido);
    }
}
