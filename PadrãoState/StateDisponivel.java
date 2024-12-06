package PadrãoState;

public class StateDisponivel extends StateIngresso {
    

    StateDisponivel(Ingresso ingresso){
        super(ingresso);
    }
    
    @Override
    public String comprar(){
        return "Ingresso disponível para compra";
        ingresso.changeState(new StateReservado());
    }

    @Override
    public String cancelar(){
        return "Não há operação ativa para ser cancelada";
    }

    @Override
    public String adicionarQuantidade(){
        return "Impossível adicionar ingressos fora do processo de compra";
    }

    @Override 
    public String removerQuantidade(){
        return "Impossível remover ingressos fora do processo de compra";
    }

}
