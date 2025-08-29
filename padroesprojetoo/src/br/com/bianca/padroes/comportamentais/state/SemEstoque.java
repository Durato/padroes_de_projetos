package br.com.bianca.padroes.comportamentais.state;

public class SemEstoque implements State {

    private MaquinaVenda maquina;

    public SemEstoque(MaquinaVenda maquina) {
        this.maquina = maquina;
    }

    @Override
    public void inserirMoeda() {
        System.out.println("Produto esgotado, não é possivel inserir moeda");
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("Nenhuma moeda foi inserida");
    }

    @Override
    public void acionarAlavanca() {
        System.out.println("Produto Esgotado");
    }

    @Override
    public void dispensarProduto() {
        System.out.println("Nenhum produto disponivel");
    }
}
