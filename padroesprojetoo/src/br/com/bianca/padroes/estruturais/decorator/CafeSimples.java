package br.com.bianca.padroes.estruturais.decorator;

public class CafeSimples implements Cafe {


    @Override
    public double getPreco() {
        return 5.0;
    }

    @Override
    public String getDescricao() {
        return " Cafe Simples";
    }
}
