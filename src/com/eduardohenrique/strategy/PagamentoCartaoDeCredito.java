package com.eduardohenrique.strategy;

import woutpattern.strategy.Cliente;

public class PagamentoCartaoDeCredito implements PagamentoStrategy{

    @Override
    public void pagar(Cliente cliente, double quantia) {
        cliente.getCartao().acrescentarNaFatura(quantia);
    }
}
