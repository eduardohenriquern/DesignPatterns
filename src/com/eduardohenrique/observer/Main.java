package com.eduardohenrique.observer;

public class Main {

    public static void main(String[] args) {
        Eleicao eleicao = new Eleicao();
        PublicadorDeResultado publicador = new PublicadorDeResultado();
        TabelaListener tabela = new TabelaListener();
        publicador.addListener(tabela);

        eleicao.addVotoApurado("Corruptiel", 12);
        eleicao.addVotoApurado("Roubaldo", 4);
        eleicao.addVotoApurado("Falcatrildo", 10);


        eleicao.publicarResultado();
        tabela.atualizar(eleicao.getVotosApurados());
    }
}
