package br.com.bianca.padroes.comportamentais.chainofresponsability;

public class VerificarBancoHandler extends AbstractHandler{

    @Override
    public void processar(String usuario, double valor) {
        if(!bancoDisponivel()){
            System.out.println("Banco Indisponivel");
            return;
        }
        chamarProximo(usuario, valor);
    }
    private boolean bancoDisponivel(){
        return true;
    }
}
