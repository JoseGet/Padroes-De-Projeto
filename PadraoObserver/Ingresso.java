import java.util.Observable;

public class Ingresso extends Observable {

    private String ticketState;
    private String ticketPosition;
    private String owner;

    public Ingresso(String ticketState, String ticketPosition) {
        this.ticketState = ticketState;
        this.ticketPosition = ticketPosition;
        this.owner = null; 
    }

    public void setTicketState(String newTicketState) {
        this.ticketState = newTicketState;
        setChanged(); 
        notifyObservers(); 
    }

    public void setOwner(String newOwner) {
        this.owner = newOwner;
    }

    public String getTicketState() {
        return this.ticketState;
    }

    public String getTicketPosition() {
        return this.ticketPosition;
    }

    public String getOwner() {
        return this.owner;
    }
}
