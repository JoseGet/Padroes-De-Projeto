package PadrãoState;

public class StateDisponivel extends StateIngresso {
    

    StateDisponivel(Ingresso ingresso){
        super(ingresso);
    }
    
    @Override
    public String comprar(){
        ingresso.changeState(new StateReservado(ingresso));
        return "Ingresso disponível para compra. Processo de compra inciado.";
    }

    @Override
    public String cancelar(){
        return "Não há operação ativa para ser cancelada";
    }

    @Override
    public String adicionarUnidade(){
        return "Impossível adicionar ingressos fora do processo de compra";
    }

    @Override 
    public String removerUnidade(){
        return "Impossível remover ingressos fora do processo de compra";
    }

}
