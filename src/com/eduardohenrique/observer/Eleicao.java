package com.eduardohenrique.observer;

import java.util.HashMap;
import java.util.Map;

public class Eleicao {

    private PublicadorDeResultado publicador;
    private Map<String, Integer> votosApurados;

    public Eleicao() {
        this.publicador = new PublicadorDeResultado();
        this.votosApurados = new HashMap<>();
    }

    public void addVotoApurado(String candidato, Integer qtdeVoto){
        this.votosApurados.put(candidato, qtdeVoto);
    }

    public void publicarResultado(){
        this.publicador.notificar(this.votosApurados);
    }

    public Map<String, Integer> getVotosApurados() {
        return this.votosApurados;
    }
}
