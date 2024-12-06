package PadrãoState;

public class Ingresso {

    private StateIngresso stateIngresso;
    private int quantidadeTotal = 10000;
    private boolean disponivel = true;

    void Ingresso(){
        this.stateIngresso = new StateDisponivel();
    }

    public void changeState(StateIngresso stateingresso) {
        this.stateIngresso = stateingresso;
    }


    public int setQuantidade(){
        return this.quantidade = quantidade - 1;
    }

}