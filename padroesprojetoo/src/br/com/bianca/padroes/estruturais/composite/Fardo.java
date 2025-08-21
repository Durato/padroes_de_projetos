/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bianca.padroes.estruturais.composite;


public class Fardo {

    private String nome;
    private Caixa caixa;
    private int quantidade;

    public Fardo(String nome, Caixa caixa, int quantidade) {
        this.nome = nome;
        this.caixa = caixa;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return caixa.getPreco() * quantidade;
    }
}
