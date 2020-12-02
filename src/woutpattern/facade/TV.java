package woutpattern.facade;

public class TV implements EquipamentoDeImagem, EquipamentoDeSom{

    private boolean estado = false;
    private int volume;
    private static final int VOL_MAX = 100;
    private static final int VOL_MIN = 0;

    public TV() {
        this.volume = 0;
    }

    public void ligar(){
        this.setEstado(true);
        System.out.println("Ligando a TV...");
    }
    public void desligar(){
        this.setEstado(false);
        System.out.println("Desligando a TV...");
    }

    public void setVolume(int vol){
        this.volume = vol;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public void emitirImagem(FonteDeImagem imagem) {
        imagem.gerarImagem();
        System.out.println("Exibindo imagem...");
    }

    @Override
    public void emitirSom(FonteDeSom audio) {
        audio.gerarSom();
        System.out.println("Emitindo som...");
    }
}
