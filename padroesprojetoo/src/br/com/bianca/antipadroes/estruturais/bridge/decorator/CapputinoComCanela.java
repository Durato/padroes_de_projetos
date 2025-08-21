package br.com.bianca.antipadroes.estruturais.bridge.decorator;

public class CapputinoComCanela  extends Capputino {

    public double getPreco(){
        return super.getPreco() + 6.00;
    }

    public String getDescricao() {
        return super.getDescricao() +  "Com Canela";
    }
}