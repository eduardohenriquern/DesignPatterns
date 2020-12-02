package com.eduardohenrique.facade;
import woutpattern.facade.*;

public class SistemaMultimidiaFacade {

    private DVDPlayer dvdPlayer;
    private HomeTheater homeTheater;
    private Projetor projetor;
    private TV tv;

    public SistemaMultimidiaFacade() {
        this.dvdPlayer = new DVDPlayer();
        this.homeTheater = new HomeTheater();
        this.projetor = new Projetor();
        this.tv = new TV();
    }

    public void ligarSistema(DVD dvd){
        System.out.println(" ====== LIGANDO EQUIPAMENTOS ======");
        dvdPlayer.ligar();
        homeTheater.ligar();
        projetor.ligar();
        tv.desligar();
        dvdPlayer.setSaidaDeImagem(projetor);
        dvdPlayer.setSaidaDeSom(homeTheater);
        homeTheater.setModoSom(ModoSonoro.CINEMA);
        System.out.println("Inserindo DVD...");
        dvdPlayer.inserirDVD(dvd);
    }

    public void desligarEquipamentos(){
        dvdPlayer.ejetarDVD();
        System.out.println(" ====== DESLIGANDO EQUIPAMENTOS ======");
        dvdPlayer.setSaidaDeImagem(tv);
        dvdPlayer.setSaidaDeSom(tv);
        dvdPlayer.desligar();
        projetor.desligar();
        homeTheater.setVolume(0);
        homeTheater.desligar();
    }

    public void play(){
        dvdPlayer.play();
    }

    public void pause(){
        dvdPlayer.pause();
    }

    public void stop(){
        dvdPlayer.stop();
    }

    public void definirVolume(int volume){
        homeTheater.setVolume(volume);
    }

}
