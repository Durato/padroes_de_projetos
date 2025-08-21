package br.com.bianca.padroes.estruturais.decorator;

public class Capputino extends CafeDecorator {

    public Capputino(Cafe cafe) {
        super(cafe);
    }

    public double getPreco() {
        return super.getPreco() + 5.00;
    }

    public String getDescricao() {
        return " Capputino";
    }
}
