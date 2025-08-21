/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bianca.padroes.estruturais.composite;


public class Principal {
    
    public static void main(String[] args) {
        Produto leite = new Produto("leite 1L", 5.00);
        Caixa caixaDeLeite = new Caixa("Caixa da Leite", leite, 12);
        Fardo fardoLeite = new Fardo("Fardo leite", caixaDeLeite, 6);
        
        double total = leite.getPreco() + caixaDeLeite.getPreco() + fardoLeite.getPreco();
        System.out.println("Total compra: R$" + total);

        Embalagem caixasDeLeite = new Embalagem("Caixa De leite 12 Unidades");
        for (int i = 0; i<12; i++) {
            caixasDeLeite.adicionarItem(leite);
        }

        Embalagem fardoDeLeite = new Embalagem("Fardo leite 12 Unidades");
        for (int i = 0; i<12; i++) {
            fardoDeLeite.adicionarItem(caixasDeLeite);
        }

        Embalagem carrinho = new Embalagem("Carrinho");
        carrinho.adicionarItem(fardoDeLeite);
        carrinho.adicionarItem(leite);
        carrinho.adicionarItem(caixasDeLeite);
        carrinho.adicionarItem(caixasDeLeite);

    }
    
}
