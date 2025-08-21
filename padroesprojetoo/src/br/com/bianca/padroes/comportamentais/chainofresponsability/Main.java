package br.com.bianca.padroes.comportamentais.chainofresponsability;

public class Main {
    public static void main(String[] args) {
        Handler validacao = new ValidacaoValorHandler();
        Handler saldo = new VerificarSaldoHandler();
        Handler limite = new VerificarLimiteHandler();
        Handler banco = new VerificarBancoHandler();
        Handler processarPagamento = new ProcessarPagamentoHandler();

        validacao.setProximo(saldo);
        saldo.setProximo(limite);
        limite.setProximo(banco);
        banco.setProximo(processarPagamento);

        System.out.println("Tentando processar pagamento de 300R$ para João");
        validacao.processar("Joao", 300);

        System.out.println("-----------------");
        System.out.println("Tentando processar pagamento de 700R$ para Maria");
        validacao.processar("Maria", 700);

    }
}
