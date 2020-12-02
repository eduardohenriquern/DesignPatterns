package com.eduardohenrique.strategy;

import woutpattern.strategy.*;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("Jogo de canetas", 10.0);
        Item item2 = new Item("Caderno", 20.0);
        Item item3 = new Item("Mochila", 50.0);

        Pedido p1 = new Pedido(
                new Cliente("Eduardo", "111.111.111-11",
                        new ContaCorrente("1234", 100),
                        new Cartao("4321", TipoCartao.DUPLO)));
        p1.addItem(item1);
        p1.addItem(item2);

        Pedido p2 = new Pedido(
                new Cliente("Júlia", "222.111.111-11",
                        new ContaCorrente("4567", 100),
                        new Cartao("123", TipoCartao.CREDITO)));
        p2.addItem(item2);
        p2.addItem(item3);

        Pedido p3 = new Pedido(
                new Cliente("Maria", "333.111.111-11",
                        new ContaCorrente("3542", 100),
                        new Cartao("312", TipoCartao.DEBITO)));
        p3.addItem(item1);
        p3.addItem(item3);

        System.out.println("Pedido 1 pago no cartão de crédito.");
        p1.realizarPagamento(new PagamentoCartaoDeCredito());
        System.out.println("\n\n Pedido 2 pago no boleto.");
        p2.realizarPagamento(new PagamentoViaBoleto());
        System.out.println("\n\n Pedido 3 pago no débito.");
        p3.realizarPagamento(new PagamentoEmDebito());

    }


}
