package com.eduardohenrique.decorator;

public class OvolmaltineDecorator extends SorveteDecorator{

    public OvolmaltineDecorator(Sorvete sorvete) {
        super(sorvete);
    }

    @Override
    public String getComplemento() {
        return sorvete.getComplemento()+"+ ovomaltine ";
    }
}
