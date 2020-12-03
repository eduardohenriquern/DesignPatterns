package com.eduardohenrique.composite;

public class Div extends ElementoHTMLComposite{

    //private String id;
    //private String classe;

    public Div() {
      //  this.id = id;
    }

    @Override
    public void abrirTag() {
        System.out.println("<div>");
        super.abrirTag();
    }

    public void fecharTag(){
        super.fecharTag();
        System.out.println("</div>");
    }

    /*
    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
    */
}
