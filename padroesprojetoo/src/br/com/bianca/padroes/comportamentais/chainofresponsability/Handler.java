package br.com.bianca.padroes.comportamentais.chainofresponsability;

public interface Handler {
    public void setProximo(Handler proximo);
    public void processar(String usuario, double valor);
}


