package br.com.bianca.padroes.comportamentais.comand;

public class PedidoHamburguer implements Pedido {

    private Cozinheiro cozinheiro;

    public PedidoHamburguer(Cozinheiro cozinheiro) {
        this.cozinheiro = cozinheiro;
    }

    @Override
    public void executar() {
        cozinheiro.fazerHamburguer();
    }
}
