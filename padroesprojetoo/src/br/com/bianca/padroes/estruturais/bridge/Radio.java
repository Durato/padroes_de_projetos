/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bianca.padroes.estruturais.bridge;


public class Radio implements Dispositivo {

    @Override
    public void ligar() {
        System.out.println("Radio ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Radio desligado");
    }

    @Override
    public void aumentarVolume() {
        System.out.println("Volume do radio aumentado");
    }

}
