package br.com.bianca.padroes.comportamentais.observer;

public class Main {
    public static void main(String[] args) {

        Produto produto = new Produto("Notebook", 200);

        Cliente cliente1 = new Cliente("Bianca");
        Cliente cliente2 = new Cliente("Pedro");
        Cliente cliente3 = new Cliente("Misael");
        Cliente cliente4 = new Cliente("Rafael");
        Cliente cliente5 = new Cliente("Fernanda");

        produto.adicionarObservador(cliente1);
        produto.adicionarObservador(cliente2);
        produto.adicionarObservador(cliente3);
        produto.adicionarObservador(cliente4);
        produto.adicionarObservador(cliente5);

        produto.setQuantidade(5);

        produto.removerObservador(cliente1);
        produto.setQuantidade(10);

    }
}
