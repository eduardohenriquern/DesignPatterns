package com.eduardohenrique.decorator;

public class AmendoimDecorator extends SorveteDecorator{

    public AmendoimDecorator(Sorvete sorvete) {
        super(sorvete);
    }

    @Override
    public String getComplemento() {
        return sorvete.getComplemento()+"+ amendoim ";
    }
}
