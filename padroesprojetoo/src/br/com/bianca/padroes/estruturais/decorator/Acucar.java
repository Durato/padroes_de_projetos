package br.com.bianca.padroes.estruturais.decorator;

public class Acucar extends CafeDecorator {

    public Acucar(Cafe cafe) {
        super(cafe);
    }

    public double getPreco() {
        return super.getPreco() + 1.00;
    }

    public String getDescricao() {
        return super.getDescricao() + " com açucar";
    }
}
