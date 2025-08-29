package br.com.bianca.padroes.comportamentais.observer;

import java.util.ArrayList;
import java.util.List;

public class Produto implements Subject {

    private String nome;
    private int quantidade;
    private List<Observer> observers;

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.observers = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        notificarObservador();
    }

    @Override
    public void adicionarObservador(Observer observador) {
        observers.add(observador);

    }

    @Override
    public void removerObservador(Observer observador) {
        observers.remove(observador);

    }

    @Override
    public void notificarObservador() {
        for (Observer observer : observers) {
            observer.atualizar(nome, quantidade);
        }

    }
}
