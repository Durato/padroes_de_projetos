package br.com.bianca.padroes.comportamentais.state;

public class SemMoedas implements State{

    private MaquinaVenda maquina;

    public SemMoedas(MaquinaVenda maquina) {
        this.maquina = maquina;
    }

    @Override
    public void inserirMoeda() {
        System.out.println("Moeda inserida");
        maquina.setEstado(maquina.getComMoedas());
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("Nenhuma moeda foi inserida");
    }

    @Override
    public void acionarAlavanca() {
        System.out.println("Voce precisa inserir uma moeda");
    }

    @Override
    public void dispensarProduto() {
        System.out.println("Nenhuma moeda dispensada");
    }
}
