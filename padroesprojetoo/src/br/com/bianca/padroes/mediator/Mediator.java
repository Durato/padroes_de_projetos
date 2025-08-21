package br.com.bianca.padroes.mediator;

public interface Mediator {

    void enviarMnesagem (String mensagem, Colaborador colaborador);

    void adicionarColaborador (Colaborador colaborador);

}
