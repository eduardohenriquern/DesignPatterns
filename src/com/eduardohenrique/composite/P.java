package com.eduardohenrique.composite;

public class P implements ElementoHTML{


    public P() {
    }

    @Override
    public void abrirTag() {
        System.out.println("<p>");
    }
    public void fecharTag() {
        System.out.println("</p>");
    }

}
