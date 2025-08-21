package br.com.bianca.padroes.estruturais.decorator;

public class Adocante extends CafeDecorator {

    public Adocante(Cafe cafe) {
        super(cafe);
    }

    public double getPreco() {
        return super.getPreco() + 0.50;
    }

    public String getDescricao() {
        return super.getDescricao() + " com adocante";
    }
}

