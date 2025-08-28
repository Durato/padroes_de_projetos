package br.com.bianca.padroes.mediator;

public class Main {
    public static void main(String[] args) {

        Mediator mediator = new MediatorConcreto();

        Colaborador colaborador1 = new ColaboradorConcreto(mediator, "Bianca");

        Colaborador colaborador2 = new ColaboradorConcreto(mediator, "Misael");

        Colaborador colaborador3 = new ColaboradorConcreto(mediator, "Rafael");

        colaborador1.enviarMensagem("Ola a todos ");
        colaborador2.enviarMensagem("Oi, Bianca");
        colaborador3.enviarMensagem("Oi, " +
                "pessoal");

    }
}
