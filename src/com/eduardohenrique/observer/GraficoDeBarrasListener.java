package com.eduardohenrique.observer;

import java.util.Map;

public class GraficoDeBarrasListener implements ExibidorDeResultadoListener {

    public GraficoDeBarrasListener() {
    }

    @Override
    public void atualizar(Map<String, Integer> votosApurados) {
        gerarGrafico(votosApurados);
    }

    public void gerarGrafico(Map<String, Integer> votosApurados){
        // código para gerar o gráfico
    }
}
