/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bianca.padroes.estruturais.bridge;

public class Televisao implements Dispositivo {

    @Override
    public void ligar() {
        System.out.println("Tv ligada");
    }

    @Override
    public void desligar() {
        System.out.println("Tv desligada");
    }

    @Override
    public void aumentarVolume() {
        System.out.println("Volume da Tv aumentado");
    }

}
