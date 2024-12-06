package PadrãoState;

public class Ingresso {

    private StateIngresso stateIngresso;
    public int quantidadeTotal = 10000;
    private boolean disponivel = true;
    private int quantidadeCompra = 0;

    Ingresso() {
        this.stateIngresso = new StateDisponivel(this);
    }

    public StateIngresso getState() {
        return stateIngresso;
    }

    public int getQuantidadeTotal() {
        return this.quantidadeTotal;
    }

    public int getQuantidadeCompra() {
        return this.quantidadeCompra;
    }

    public void changeState(StateIngresso stateingresso) {
        this.stateIngresso = stateingresso;
    }


    public int setQuantidadeTotal() {
        return this.quantidadeTotal = quantidadeTotal - 1;
    }

    public int adicionarUnidade() {
        return this.quantidadeCompra++;
    }

    public int removeUnidade() {
        return this.quantidadeCompra--;
    }

    public boolean setDisponivel() {
        return this.disponivel = !disponivel;
    }

}