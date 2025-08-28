package br.com.bianca.padroes.comportamentais.interprete;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Artigo> artigos =  Arrays.asList(
                new Artigo("Arquitetura de software moderna"),
                new Artigo("Padroes Mvc na Web"),
                new Artigo("Model view controler explicado"),
                new Artigo("introdução a inteligencia artificial"),
                new Artigo("Arquitetura de software e mvc"),
                new Artigo("Arquitetura de software e model view controler")
        );

        Expressao termo1 = new Palavra("arquitetura de software");
        Expressao termo2 = new Palavra("mvc");
        Expressao termo3 = new Palavra("model View Controler");

        Expressao or = new OrExpressao(termo2, termo3);
        Expressao query = new AndExpressao(termo1, or);

        for (Artigo artigo : artigos) {
            if(query.Interpretar(artigo)) {
                System.out.println("Encontrado: " + artigo.getTitulo());
            }
        }

    }
}
