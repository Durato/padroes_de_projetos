package br.com.bianca.padroes.mediator;

import java.util.ArrayList;
import java.util.List;

public class MediatorConcreto implements Mediator{

    private List<Colaborador> colaboradores;

    public MediatorConcreto() {
        this.colaboradores = new ArrayList();
    }

    @Override
    public void enviarMnesagem(String mensagem, Colaborador remetente) {
        for(Colaborador colaborador : colaboradores){
            if(colaborador != remetente){
                colaborador.receberMensagem(mensagem);
            }
        }

    }

    @Override
    public void adicionarColaborador(Colaborador colaborador) {
        colaboradores.add(colaborador);
    }
}
