package br.com.bianca.padroes.estruturais.decorator;

public class Principal {
    public static void main(String[] args) {

        Cafe cafe = new CafeSimples();
        System.out.println(cafe.getDescricao() + "R$" + cafe.getPreco());

        Cafe cafeComLeiteeAcucar = new Acucar(new Leite(new CafeSimples()));
        System.out.println(cafeComLeiteeAcucar.getDescricao() + " R$" + cafeComLeiteeAcucar.getPreco());

    }


}
