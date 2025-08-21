package br.com.bianca.antipadroes.estruturais.bridge;

public class RadioComControleAvancado {

    public void ligar() {
        System.out.println("Radio ligado");
    }

    public void desligar() {
        System.out.println("Radio desligado");
    }

    public void aumentarVolume() {
        System.out.println("Volume do radio aumentado");
    }

    public void mudarEstacao(double estacao) {
        System.out.println("Radio sintonizado na estacao " + estacao + "MHz");
    }
}
