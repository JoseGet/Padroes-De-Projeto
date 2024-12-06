package PadrãoState;

public class StateReservado extends StateIngresso{

    StateReservado(Ingresso ingresso) {
        super(ingresso);
    }

    @Override
    public String comprar(){

        if(ingresso.quantidadeTotal <= 0) {
            ingresso.changeState(new StateIndisponivel(ingresso));
            return "Impossível finalizar a operação! O ingresso desejado já está esgotado.";
        } else {
            ingresso.changeState(new StateComprado(ingresso));
            ingresso.quantidadeTotal = ingresso.quantidadeTotal - ingresso.getQuantidadeCompra();
            return "Compra efetuada!";
        }
    }

    @Override
    public String cancelar(){
        ingresso.changeState(new StateDisponivel(ingresso));
        return "Operação cancelada!";
    }
    
    @Override
    public String adicionarUnidade(){
        ingresso.adicionarUnidade();
        return "Quantidade de ingressos aumentada em uma unidade!";
    }
    
    @Override 
    public String removerUnidade(){

        ingresso.removeUnidade();
    
        if(ingresso.getQuantidadeCompra() == 0){
            ingresso.changeState(new StateDisponivel(ingresso));
            return "Quantidade de ingresso igual a 0! Operação cancelada";
        } else {
            return "Quantidade de ingressos diminuida em uma unidade!";
        }
    }
    
}
