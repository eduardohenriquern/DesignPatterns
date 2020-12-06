package com.eduardohenrique.decorator;

public class CremeDeChocolate extends SorveteDecorator{

    public CremeDeChocolate(Sorvete sorvete) {
        super(sorvete);
    }

    @Override
    public String getComplemento() {
        return sorvete.getComplemento()+"+ creme de chocolate ";
    }
}
