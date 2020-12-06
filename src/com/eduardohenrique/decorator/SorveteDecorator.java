package com.eduardohenrique.decorator;

public abstract class SorveteDecorator implements Sorvete{

    Sorvete sorvete;

    public SorveteDecorator(Sorvete sorvete) {
        this.sorvete = sorvete;
    }

    @Override
    public abstract String getComplemento();

}
