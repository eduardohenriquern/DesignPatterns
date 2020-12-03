package com.eduardohenrique.composite;

public class H1 implements ElementoHTML{

    public H1() {
    }

    @Override
    public void abrirTag() {
        System.out.println("<h1>");
    }
    public void fecharTag() {
        System.out.println("</h1>");
    }

}
