package br.com.bianca.padroes.comportamentais.observer;

public interface Subject {

    void adicionarObservador(Observer observador);
    void removerObservador(Observer observador);
    void notificarObservador();

}
