/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bianca.padroes.estruturais.bridge;


public class Projetor implements Dispositivo {

    @Override
    public void ligar() {
        System.out.println("Projetor ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Projetor desligado");
    }

    @Override
    public void aumentarVolume() {
        System.out.println("Volume do projetor aumentado");
    }

    public void mudarFonte(String fonte) {
        System.out.println("Projetor mudando para fonte " + fonte);
    }
}
