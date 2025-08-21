package br.com.bianca.padroes.comportamentais.chainofresponsability;

public class VerificarSaldoHandler extends AbstractHandler {

    @Override
    public void processar(String usuario, double valor) {
        if (valor > 1000 ) {
            System.out.println(usuario + ": Saldo Insuficiente");
            return;
        }
        chamarProximo(usuario, valor);
    }
}
