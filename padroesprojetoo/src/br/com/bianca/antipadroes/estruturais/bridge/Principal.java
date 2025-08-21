/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bianca.antipadroes.estruturais.bridge;


public class Principal {

    public static void main(String[] args) {
        TvComControleBasico tvBasica = new TvComControleBasico();
        tvBasica.ligar();
        tvBasica.aumentarVolume();

        RadioComControleAvancado radioAvancado = new RadioComControleAvancado();
        radioAvancado.ligar();
        radioAvancado.mudarEstacao(102.7);

    }

}
