package br.com.bianca.padroes.comportamentais.comand;

public class Garcom {

    public void enviarPedido(Pedido pedido) {
        pedido.executar();
    }

}
