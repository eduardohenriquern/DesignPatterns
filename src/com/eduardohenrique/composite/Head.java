package com.eduardohenrique.composite;

public class Head extends ElementoHTMLComposite{

    public Head() {
    }

    @Override
    public void abrirTag() {
        System.out.println("<head>");
        super.abrirTag();
    }
    public void fecharTag() {
        super.abrirTag();
        System.out.println("</head>");
    }
}
