package br.com.bianca.padroes.comportamentais.state;

public class Main {
    public static void main(String[] args) {
        MaquinaVenda maquina = new MaquinaVenda(2);

        System.out.println("------");
        System.out.println("Primeira tentativa sem inserir moeda");
        maquina.acionarAlavanca();


        System.out.println("------");
        System.out.println("Segunda tentativa com inserir moeda");
        maquina.inserirMoeda();
        maquina.acionarAlavanca();


        System.out.println("------");
        System.out.println("Terceira tentativa Ejetando moeda");
        maquina.inserirMoeda();
        maquina.ejetarMoeda();


        System.out.println("------");
        System.out.println("Quarta tentativa com inserir moeda");
        maquina.inserirMoeda();
        maquina.acionarAlavanca();


        System.out.println("------");
        System.out.println("Quinta tentativa inserindo moeda mas sem estoque");
        maquina.inserirMoeda();

    }
}
