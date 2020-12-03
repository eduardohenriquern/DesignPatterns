package com.eduardohenrique.composite;

public class Html extends ElementoHTMLComposite{

    public Html() {
    }

    @Override
    public void abrirTag() {
        System.out.println("<html>");

        super.abrirTag();
    }
    public void fecharTag() {
        super.fecharTag();
        System.out.println("</html>");
    }
}
