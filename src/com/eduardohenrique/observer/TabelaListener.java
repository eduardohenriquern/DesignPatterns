package com.eduardohenrique.observer;

import java.util.HashMap;
import java.util.Map;

public class TabelaListener implements ExibidorDeResultadoListener{

    private Map<String, Integer> resultadoParcial;

    public TabelaListener() {
        this.resultadoParcial = new HashMap<>();
    }

    @Override
    public void atualizar(Map<String, Integer> votosApurados) {
        System.out.println("=== Gerando Tabela ===\n" +
                "[Candidato] : [Quantidade de votos]\n");
        for (Map.Entry<String, Integer> resultado : votosApurados.entrySet()){
            System.out.println(resultado.getKey() + " : " + resultado.getValue());
        }
    }

    public void sincronizar() {
        System.out.println("=== Gerando Tabela ===\n" +
                "[Candidato] : [Quantidade de votos]\n");
        for (Map.Entry<String, Integer> resultado : this.resultadoParcial.entrySet()){
            System.out.println(resultado.getKey() + " : " + resultado.getValue());
        }
    }
}
