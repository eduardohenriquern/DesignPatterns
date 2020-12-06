package com.eduardohenrique.decorator;

public class LeiteEmPoDecorator extends SorveteDecorator{

    public LeiteEmPoDecorator(Sorvete sorvete) {
        super(sorvete);
    }

    @Override
    public String getComplemento() {
        return sorvete.getComplemento()+"+ leite em pó ";
    }
}
