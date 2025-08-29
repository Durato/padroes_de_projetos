package br.com.bianca.padroes.comportamentais.state;

public class ComMoeda implements State{

    private MaquinaVenda maquina;

    public ComMoeda(MaquinaVenda maquina) {
        this.maquina = maquina;
    }

    @Override
    public void inserirMoeda() {
        System.out.println("Ja existe uma moeda");
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("Moeda Ejetada");
        maquina.setEstado(maquina.getSemMoedas());
    }

    @Override
    public void acionarAlavanca() {
        System.out.println("Alavanca Acionada");
        maquina.setEstado(maquina.getVendendo());
    }

    @Override
    public void dispensarProduto() {
        System.out.println("Nenhum produto dispensado");
    }
}
