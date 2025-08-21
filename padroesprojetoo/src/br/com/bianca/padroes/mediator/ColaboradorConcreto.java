package br.com.bianca.padroes.mediator;

public class ColaboradorConcreto extends Colaborador{

    public ColaboradorConcreto(Mediator mediator, String nome) {
        super(mediator, nome);
    }

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println(this.nome + ": Enviou essa Mensagem " + mensagem);
        mediator.enviarMnesagem(mensagem, this);
    }

    @Override
    public void receberMensagem(String mensagem) {

    }
}
