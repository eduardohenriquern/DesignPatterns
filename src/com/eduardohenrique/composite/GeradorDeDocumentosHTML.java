package com.eduardohenrique.composite;


public class GeradorDeDocumentosHTML {
    public static void main(String[] args) {
        Html html = new Html();
        Head head = new Head();
        Div div1 = new Div();
        Div div2 = new Div();
        Body body  = new Body();
        H1 h1 = new H1();
        P p = new P();


        html.add(head);
        html.add(body);
        body.add(div1);
        div1.add(h1);
        div1.add(p);
        div1.add(div2);
        div2.add(h1);
        div2.add(p);
        div2.add(p);

        html.abrirTag();
        html.fecharTag();


    }
}
