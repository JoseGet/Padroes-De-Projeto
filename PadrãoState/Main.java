package PadrãoState;

import javax.swing.text.StyledEditorKit;

public class Main {
    public static void main(String[] args) {

        Ingresso ingresso = new Ingresso();

        System.out.println("Seja bem vindo a compra de Ingressos da Copa do Mundo de 2026! No momento existem " + ingresso.quantidadeTotal + " ingressos disponiveis.");

        System.out.println(ingresso.getState().comprar());

        System.out.println(ingresso.getState().adicionarUnidade());
        System.out.println(ingresso.getState().adicionarUnidade());
        System.out.println(ingresso.getState().adicionarUnidade());

        System.out.println("Voce tem no total " + ingresso.getQuantidadeCompra() + " ingressos no carrinho");

        System.out.println(ingresso.getState().cancelar());

        System.out.println(ingresso.getState());


    }
}
