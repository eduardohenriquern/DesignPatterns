package com.eduardohenrique.facade;

import woutpattern.facade.DVD;
import woutpattern.facade.SistemaMultimidia;

public class Main {
    public static void main(String[] args) {
        SistemaMultimidiaFacade smfacade = new SistemaMultimidiaFacade();
        DVD vingadores = new DVD("Vingadores Guerra Infinita", 220.0);

        smfacade.ligarSistema(vingadores);
        smfacade.definirVolume(60);
        smfacade.play();
        System.out.println(" ====== O FILME TERMINOU ======");
        smfacade.stop();
        smfacade.desligarEquipamentos();
    }
}
