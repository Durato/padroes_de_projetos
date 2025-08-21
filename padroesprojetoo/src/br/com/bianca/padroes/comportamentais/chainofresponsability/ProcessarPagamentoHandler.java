package br.com.bianca.padroes.comportamentais.chainofresponsability;

public class ProcessarPagamentoHandler extends AbstractHandler{

    @Override
    public void processar(String usuario, double valor) {
        System.out.println("Pagamento de R$ " + valor + " Realizado com sucesso para " + usuario);
    }
}
