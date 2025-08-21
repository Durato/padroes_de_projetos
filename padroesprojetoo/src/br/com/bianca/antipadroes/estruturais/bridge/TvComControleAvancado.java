package br.com.bianca.antipadroes.estruturais.bridge;


public class TvComControleAvancado {

    public void ligar() {
        System.out.println("Tv ligada");
    }

    public void desligar() {
        System.out.println("Tv desligada");
    }

    public void aumentarVolume() {
        System.out.println("Volume da Tv aumentado");
    }

    public void mudarCanal(int canal) {
        System.out.println("Tv mudou para o " + canal);
    }

}
