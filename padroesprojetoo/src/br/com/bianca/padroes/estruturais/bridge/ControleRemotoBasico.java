/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bianca.padroes.estruturais.bridge;


public class ControleRemotoBasico extends ControleRemoto {

    public ControleRemotoBasico(Dispositivo dispositivo) {
        super(dispositivo);
    }

    public void silenciar() {
        System.out.println("Dispositivo silenciado");
    }
}
