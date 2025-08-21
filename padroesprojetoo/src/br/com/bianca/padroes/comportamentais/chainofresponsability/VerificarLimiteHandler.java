package br.com.bianca.padroes.comportamentais.chainofresponsability;

public class VerificarLimiteHandler extends AbstractHandler{

    @Override
    public void processar(String usuario, double valor) {
        if(valor > 500){
            System.out.println("Limite excedido");
            return;
        }
        chamarProximo(usuario, valor);
    }
}
