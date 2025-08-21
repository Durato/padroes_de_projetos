/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bianca.padroes.estruturais.bridge;

public class Principal {
    
    public static void main (String[] args){
    Dispositivo tv = new Televisao();
    Dispositivo radio = new Radio();
    Dispositivo projetor = new Projetor();
    
    //criar controle
    ControleRemoto controleBasicoTv = new ControleRemotoBasico(tv);
    ControleRemoto controleBasicoRadio = new ControleRemotoBasico(radio);
    ControleRemoto controleAvancadoProjetor = new ControleRemotoAvancado(projetor);
    
    //usando controles
    controleBasicoTv.ligar();
    controleBasicoTv.aumentarVolume();
    
    controleBasicoRadio.ligar();
    controleBasicoRadio.desligar();
    
    }
}

