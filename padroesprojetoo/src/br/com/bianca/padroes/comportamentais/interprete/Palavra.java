package br.com.bianca.padroes.comportamentais.interprete;

public class Palavra implements Expressao{

    private String termo;

    public Palavra(String termo){
        this.termo = termo.toLowerCase();
    }

    @Override
    public boolean Interpretar(Artigo artigo) {
        return artigo.getTitulo().contains(termo);
    }
}
