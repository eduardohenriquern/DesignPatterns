package com.eduardohenrique.strategy;
import woutpattern.strategy.Cliente;

public interface PagamentoStrategy {
    public void pagar(Cliente cliente, double quantia);
}
