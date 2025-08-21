package br.com.bianca.antipadroes.estruturais.bridge.decorator;

public class CafeComAcucar extends Cafe {

    public double getPreco(){
        return super.getPreco() + 1.00;
    }

    public String getDescricao() {
        return super.getDescricao() +"com Acucar";
    }
}
