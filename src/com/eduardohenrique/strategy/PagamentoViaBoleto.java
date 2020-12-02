package com.eduardohenrique.strategy;

import woutpattern.strategy.Cliente;

import java.text.DateFormat;

public class PagamentoViaBoleto implements PagamentoStrategy{
    @Override
    public void pagar(Cliente cliente, double quantia) {
        this.gerarBoleto(cliente.getNome(), cliente.getCpf(), quantia);
    }

    public void gerarBoleto(String nome, String cpf, double quantia){
        String boleto =
                "======== BOLETO GERADO ========\n" +
                "Titular: " + nome + "\n" +
                "CPF: " +cpf + "\n"+
                "Vencimento: " + DateFormat.getDateInstance().getCalendar().getTime() +"\n"+
                "Quantia: " + quantia +"\n" +
                "========================";

        System.out.println(boleto);
    }
}
