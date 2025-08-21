package br.com.bianca.antipadroes.estruturais.bridge.decorator;

public class Capputino extends Cafe {

    public double getPreco(){
        return super.getPreco() + 4.00;
    }

    public String getDescricao() {
        return "Capputino";
    }
}

