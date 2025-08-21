package br.com.bianca.padroes.estruturais.composite;

import java.util.ArrayList;
import java.util.List;

public class Embalagem implements item {

    private String nome;
    private List<item> itens = new ArrayList<>();

    public Embalagem(String nome) {
        this.nome = nome;
    }


    public void adicionarItem(item item) {
        itens.add(item);
    }

    @Override
    public double getPreco() {
        double total = 0;
        for (item item : itens) {total += item.getPreco();
    }
        return total;}

    public void listarItems() {
        System.out.println(nome + "Contém");
        for (item item : itens) {
            System.out.println("-" + item.getNome() + "R$" + item.getPreco());
        }
    }

    @Override
    public String getNome() {
        return "";
    }
}
