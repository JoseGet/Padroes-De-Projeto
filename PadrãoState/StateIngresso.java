package PadrãoState;

public abstract class StateIngresso {
  
    Ingresso ingresso;

    StateIngresso(Ingresso ingresso) {
        this.ingresso = ingresso;
    }

    public abstract String comprar();
    public abstract String cancelar(); 
    public abstract String adicionarUnidade();
    public abstract String removerUnidade();

}
