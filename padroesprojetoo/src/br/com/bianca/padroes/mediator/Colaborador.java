package br.com.bianca.padroes.mediator;

public abstract class Colaborador {

    protected Mediator mediator;
    protected String nome;

    public Colaborador(Mediator mediator, String nome) {
        this.mediator = mediator;
        this.nome = nome;
        mediator.adicionarColaborador(this);
    }

    public abstract void enviarMensagem (String mensagem);
    public abstract void receberMensagem (String mensagem);

}
