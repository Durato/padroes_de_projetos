package br.com.bianca.padroes.memento;

public class Main {
    public static void main(String[] args) {


        EditorTexto editor = new EditorTexto();
        Historico historico = new Historico();

        editor.escrever("Ola ");
        historico.salvarMemento(editor.salvar());

        editor.escrever("Mundo ");
        historico.salvarMemento(editor.salvar());

        editor.escrever("Esse é um editor de texto ");
        System.out.println("Texto atual " + editor.mostrarTexto());

        editor.desfazer(historico.desfazer());
        System.out.println("Apos desfazer " + editor.mostrarTexto());

        editor.desfazer(historico.desfazer());
        System.out.println("Apos desfazer novamente " + editor.mostrarTexto());



    }
}
