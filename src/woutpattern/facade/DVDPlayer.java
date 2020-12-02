package woutpattern.facade;

public class DVDPlayer implements FonteDeImagem, FonteDeSom{

    private boolean estado = false;
    private DVD dvd;
    private EquipamentoDeSom eqpDeSom;
    private EquipamentoDeImagem eqpDeImagem;

    public DVDPlayer(){}

    public void ligar(){
        this.setEstado(true);
        System.out.println("Ligando o DVD");
    }
    public void desligar(){
        this.setEstado(false);
        System.out.println("Desligando o DVD");
    }
    public void play(){
        System.out.println("Reproduzindo o filme...");
        this.eqpDeImagem.emitirImagem(this);
        this.eqpDeSom.emitirSom(this);
    }
    public void pause(){
        System.out.println("Filme pausado...");
    }
    public void stop(){
        System.out.println("Reprodução do filme parada...");
    }

    public void setSaidaDeImagem(EquipamentoDeImagem eqpImg){
        this.eqpDeImagem = eqpImg;
    }
    public void setSaidaDeSom(EquipamentoDeSom eqpSom){
        this.eqpDeSom = eqpSom;
    }

    public void inserirDVD(DVD dvd){
        this.dvd = dvd;
        System.out.println("DVD inserido!");
    }

    public void ejetarDVD(){
        System.out.println("DVD ejetado!");
    }

    public void gerarImagem(){
        System.out.println("Gerando imagem do filme " + this.dvd.getTitulo());
    }

    public void gerarSom(){
        System.out.println("Gerando áudio do filme " + this.dvd.getTitulo());
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
