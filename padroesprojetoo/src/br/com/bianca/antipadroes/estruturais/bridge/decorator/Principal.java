package br.com.bianca.antipadroes.estruturais.bridge.decorator;

public class Principal {
    public static void main(String[] args) {

        Cafe cafeSimples = new Cafe();
        System.out.println(cafeSimples.getDescricao() + "R$" + cafeSimples.getPreco());

        Cafe cafeComLeite = new Cafe();
        System.out.println(cafeComLeite.getDescricao() + "R$" + cafeComLeite.getPreco());

        Capputino capputino  = new Capputino();
        System.out.println(capputino.getDescricao() + "R$" + capputino.getPreco());

        Capputino capputinoComCanela = new Capputino();
        System.out.println(capputino.getDescricao() + "R$" + capputino.getPreco());


    }

}
