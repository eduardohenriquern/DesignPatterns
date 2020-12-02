package woutpattern.facade;

public class HomeTheater implements EquipamentoDeSom{

    private boolean estado = false;
    private ModoSonoro modo;
    private int volume;

    public HomeTheater() {
        this.volume = 0;
    }

    public void ligar(){
        this.setEstado(true);
        System.out.println("Ligando o HomeTheater...");
    }
    public void desligar(){
        this.setEstado(false);
        System.out.println("Desligando o HomeTheater...");
    }

    public void setModoSom(ModoSonoro modo){
        this.modo = modo;
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
    public void emitirSom(FonteDeSom audio) {
        audio.gerarSom();
        System.out.println("Emitindo som...");
    }
}
