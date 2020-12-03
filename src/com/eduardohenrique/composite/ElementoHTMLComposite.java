package com.eduardohenrique.composite;

import java.util.LinkedList;
import java.util.List;

public class ElementoHTMLComposite implements ElementoHTML{

    private List<ElementoHTML> elementos;

    public ElementoHTMLComposite() {
        this.elementos = new LinkedList<>();
    }

    public void add(ElementoHTML e) {

        this.elementos.add(e);
    }

    public void remove(ElementoHTML e) {
        this.elementos.remove(e);
    }

    public List<ElementoHTML> getElementos() {
        return this.elementos;
    }

    @Override
    public void abrirTag() {
        for(ElementoHTML elemento : this.getElementos()){
            elemento.abrirTag();
        }
    }

    @Override
    public void fecharTag() {
        for(ElementoHTML elemento : this.getElementos()){
            elemento.fecharTag();
        }
    }
}
