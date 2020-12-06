package com.eduardohenrique.decorator;

public class Main {
    public static void main(String[] args) {
        Sorveteria pedido1 = new Sorveteria();
        Sorveteria pedido2 = new Sorveteria();
        pedido1.addSorvete(new LeiteEmPoDecorator(new Acai()));

        pedido1.mostrarPedido();

        pedido2.addSorvete(new CremeDeChocolate(new OvolmaltineDecorator(new Napolitano())));

        pedido2.mostrarPedido();


    }
}
