package br.com.bianca.padroes.estruturais.decorator;

public class Canela extends CafeDecorator {

    public Canela(Cafe cafe) {
        super(cafe);
    }

    public double getPreco() {
        return super.getPreco() + 2.50;
    }

    public String getDescricao() {
        return super.getDescricao() + " com Canela";
    }
}

