package br.com.bianca.padroes.comportamentais.state;

public class Vendendo implements State{

    private MaquinaVenda maquina;

    public Vendendo(MaquinaVenda maquina) {
        this.maquina = maquina;
    }

    @Override
    public void inserirMoeda() {
        System.out.println("Aguarde estamos processando uma venda");
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("Aguarde estamos processando uma venda");
    }

    @Override
    public void acionarAlavanca() {
        System.out.println("Alavanca ja foi acionada");
    }

    @Override
    public void dispensarProduto() {
        maquina.liberarProduto();
        if(maquina.getQuantidade() > 0){
            maquina.setEstado(maquina.getSemMoedas());
        }else{
            System.out.println("Produto Esgotado");
            maquina.setEstado(maquina.getSemEstoque());
        }
    }
}
