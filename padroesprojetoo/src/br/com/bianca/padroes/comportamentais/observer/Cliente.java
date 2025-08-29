package br.com.bianca.padroes.comportamentais.observer;

public class Cliente implements Observer {

    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String nomeProduto, int quantidade) {
        System.out.println("Cliente " + nome + " foi notificado : Prodduto: " + nomeProduto + " Quantidade: " + quantidade);
    }



}
