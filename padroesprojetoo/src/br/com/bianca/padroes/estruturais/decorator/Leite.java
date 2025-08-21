package br.com.bianca.padroes.estruturais.decorator;

public class Leite extends CafeDecorator {

    public Leite(Cafe cafe) {
        super(cafe);
    }

    public double getPreco() {
        return super.getPreco() + 3.00;
    }

    public String getDescricao() {
        return super.getDescricao() + " com Leite";
    }
}

