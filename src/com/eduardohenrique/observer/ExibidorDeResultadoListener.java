package com.eduardohenrique.observer;

import java.util.Map;

public interface ExibidorDeResultadoListener {
    public void atualizar(Map<String, Integer> votosApurados);
}
