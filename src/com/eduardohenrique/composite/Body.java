package com.eduardohenrique.composite;

public class Body extends ElementoHTMLComposite{

    public Body() {

    }

    @Override
    public void abrirTag() {
        System.out.println("<body>");
        super.abrirTag();
    }
    public void fecharTag() {
        super.fecharTag();
        System.out.println("</body>");
    }

}
