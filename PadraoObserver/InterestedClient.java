import java.util.Observable;
import java.util.Observer;

public class InterestedClient implements Observer {

    private String id;
    private Observable[] ingressos;
    private String clientName;

    public InterestedClient(Observable[] ingressos, String clientName, String clientId) {
        this.ingressos = ingressos;
        this.clientName = clientName;
        this.id = clientId;

        for (Observable ingresso : ingressos) {
            ingresso.addObserver(this);
        }
    }

    public void buyTicket(Ingresso ingresso) {
        if (ingresso.getTicketState().equals("Available")) {
            ingresso.setOwner(this.clientName);     
            ingresso.setTicketState("Purchased");  
            System.out.println(clientName + " comprou o ingresso na posição " + ingresso.getTicketPosition());
        } else {
            System.out.println("O ingresso na posição " + ingresso.getTicketPosition() + " já foi comprado.");
        }
    }

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof Ingresso) {
            Ingresso ingresso = (Ingresso) observable;
            System.out.println("Olá, " + clientName + "! O ingresso na posição '"
                    + ingresso.getTicketPosition() + "' mudou para o estado: "
                    + ingresso.getTicketState() + ". Dono atual: " + ingresso.getOwner());
        }
    }
}