package com.eduardohenrique.observer;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PublicadorDeResultado {

    private List<ExibidorDeResultadoListener> listeners;

    public PublicadorDeResultado() {
        this.listeners = new LinkedList<>();
    }

    public void addListener(ExibidorDeResultadoListener listener){
        this.listeners.add(listener);
    }

    public void notificar(Map<String, Integer> votosApurados){
        for(ExibidorDeResultadoListener listener : this.listeners){
            listener.atualizar(votosApurados);
        }
    }
}
