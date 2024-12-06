package PadrãoState;

public abstract class StateIngresso {
  
    Ingresso ingresso = new Ingresso();

    StateIngresso(Ingresso ingresso) {
        this.ingresso = ingresso;
    }

    public abstract String comprar();
    public abstract String cancelar(); 
    public abstract String adicionarQuantidade();
    public abstract String removerQuantidade();

}
