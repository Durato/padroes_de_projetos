package br.com.bianca.padroes.comportamentais.interprete;

public class Artigo {

    private String titulo;

    public Artigo (String titulo) {
        this.titulo = titulo.toLowerCase();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
