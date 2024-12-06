package PadrãoState;

public class StateComprado extends StateIngresso {

    StateComprado(Ingresso ingresso) {
        super(ingresso);
    }
    
    @Override
    public String comprar(){
        return "Ingresso(s) já comprado! Impossível efetuar operação!";
    }

    @Override
    public String cancelar(){
        return "Ingresso(s) já comprado! Impossível efetuar operação!";
    }

    @Override
    public String adicionarUnidade(){
        return "Ingresso(s) já comprado! Impossível efetuar operação!";
    }

    @Override 
    public String removerUnidade(){
        return "Ingresso(s) já comprado! Impossível efetuar operação!";
    }

}
