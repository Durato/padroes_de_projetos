/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bianca.padroes.estruturais.composite;


public class Caixa {

    private String nome;
    private Produto produto;
    private int quantidade;

    public Caixa(String nome, Produto produto, int quantidade) {
        this.nome = nome;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return produto.getPreco() * quantidade;
    }
}
