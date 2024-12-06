package PadrãoState;

public class StateIndisponivel extends StateIngresso{

    StateIndisponivel(Ingresso ingresso){
        super(ingresso);
    }

    @Override
    public String comprar(){
        return "Ingresso indisponível para compra";
    }

    @Override
    public String cancelar(){
        return "Não há operação ativa para ser cancelada";
    }

    @Override
    public String adicionarUnidade(){
        return "Impossível adicionar ingresso indisponível";
    }

    @Override 
    public String removerUnidade(){
        return "Impossível remover ingresso indisponível";
    } 

}
