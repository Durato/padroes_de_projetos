package br.com.bianca.padroes.comportamentais.interprete;

public class OrExpressao implements Expressao {

    private Expressao esquerda;
    private Expressao direita;

    public OrExpressao(Expressao direita, Expressao esquerda) {
        this.direita = direita;
        this.esquerda = esquerda;
    }

    @Override
    public boolean Interpretar(Artigo artigo) {
        return esquerda.Interpretar(artigo) || direita.Interpretar(artigo);
    }
}



