package com.eduardohenrique.strategy;

import woutpattern.strategy.Cliente;

public class PagamentoEmDebito implements PagamentoStrategy{

    @Override
    public void pagar(Cliente cliente, double quantia) {
        cliente.getContaCorrente().debitar(quantia);
    }
}
