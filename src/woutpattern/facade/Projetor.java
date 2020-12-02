package woutpattern.facade;

public class Projetor implements EquipamentoDeImagem {
    private boolean estado = false;

    public Projetor() {
    }

    public void ligar(){
        this.setEstado(true);
        System.out.println("Ligando o Projetor...");
    }
    public void desligar(){
        this.setEstado(false);
        System.out.println("Desligando o Projetor...");
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
}
