package woutpattern.facade;

public class SistemaMultimidia {
    public static void main(String[] args) {
        DVDPlayer dvdPlayer = new DVDPlayer();
        HomeTheater homeTheater = new HomeTheater();
        TV tv = new TV();
        Projetor projetor = new Projetor();
        DVD vingadores = new DVD("Vingadores Guerra Infinita", 220.0);

        System.out.println(" ====== LIGANDO EQUIPAMENTOS ======");
        dvdPlayer.ligar();
        homeTheater.ligar();
        projetor.ligar();
        tv.desligar();
        dvdPlayer.setSaidaDeImagem(projetor);
        dvdPlayer.setSaidaDeSom(homeTheater);
        homeTheater.setModoSom(ModoSonoro.CINEMA);
        homeTheater.setVolume(60);
        System.out.println("Inserindo DVD...");
        dvdPlayer.inserirDVD(vingadores);

        // Iniciando o filme
        dvdPlayer.play();
        System.out.println(" ====== O FILME TERMINOU ======");
        // Parando o filme
        dvdPlayer.stop();
        // retirando o dvd
        dvdPlayer.ejetarDVD();

        System.out.println(" ====== DESLIGANDO EQUIPAMENTOS ======");
        dvdPlayer.setSaidaDeImagem(tv);
        dvdPlayer.setSaidaDeSom(tv);
        dvdPlayer.desligar();
        projetor.desligar();
        homeTheater.setVolume(0);
        homeTheater.desligar();
    }
}
