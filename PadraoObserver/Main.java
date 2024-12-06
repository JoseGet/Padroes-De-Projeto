public class Main {
    public static void main(String[] args) {
        Ingresso ingresso1 = new Ingresso("Available", "Arquibancada");
        Ingresso ingresso2 = new Ingresso("Available", "Pista");

        Ingresso[] ingressos = {ingresso1, ingresso2};

        InterestedClient client1 = new InterestedClient(ingressos, "José", "ClienteJose");
        InterestedClient client2 = new InterestedClient(ingressos, "Pedro", "ClientePedro");

        client1.buyTicket(ingresso1); 
        client2.buyTicket(ingresso2); 
    }
}
