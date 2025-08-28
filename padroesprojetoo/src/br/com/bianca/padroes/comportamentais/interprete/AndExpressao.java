package br.com.bianca.padroes.comportamentais.interprete;

public class AndExpressao implements Expressao {

    private Expressao esquerda;
    private Expressao direita;

    public AndExpressao(Expressao direita, Expressao esquerda) {
        this.direita = direita;
        this.esquerda = esquerda;
    }

    @Override
    public boolean Interpretar(Artigo artigo) {
        return esquerda.Interpretar(artigo) && direita.Interpretar(artigo);
    }
}
