package br.com.bianca.padroes.comportamentais.state;

public class MaquinaVenda {

    private State semMoedas;
    private State semEstoque;
    private State comMoedas;
    private State Vendendo;

    private State estadoAtual;
    private int quantidade;

    public MaquinaVenda(int quantidade) {
        this.quantidade = quantidade;
        semMoedas = new SemMoedas(this);
        semEstoque = new SemEstoque(this);
        Vendendo = new Vendendo(this);
        comMoedas = new ComMoeda(this);

        if (quantidade > 0) {
            estadoAtual = semMoedas;

        }else{
            estadoAtual = semEstoque;
        }

    }

    public void inserirMoeda() {
        estadoAtual.inserirMoeda();
    }
    public void ejetarMoeda() {
        estadoAtual.ejetarMoeda();
    }
    public void acionarAlavanca(){
        estadoAtual.acionarAlavanca();
        estadoAtual.dispensarProduto();
    }
    public void setEstado(State novoEstado) {
        estadoAtual = novoEstado;
    }
    public void liberarProduto() {
        if (quantidade > 0) {
            System.out.println("Um produto foi dispensado");
            quantidade --;
        }
    }

    public State getSemEstoque() {
        return semEstoque;
    }

    public void setSemEstoque(State semEstoque) {
        this.semEstoque = semEstoque;
    }

    public State getSemMoedas() {
        return semMoedas;
    }

    public void setSemMoedas(State semMoedas) {
        this.semMoedas = semMoedas;
    }

    public State getComMoedas() {
        return comMoedas;
    }

    public void setComMoedas(State comMoedas) {
        this.comMoedas = comMoedas;
    }

    public State getVendendo() {
        return Vendendo;
    }

    public void setVendendo(State vendendo) {
        Vendendo = vendendo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
