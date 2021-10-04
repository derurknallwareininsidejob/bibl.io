package oszimt;

public class LibUser {

    private int id;
    private String name;
    private int feeState;
    private LibCard card;


    public LibUser() {
        this.id = (int)(Math.random()*((99999-10000)+1)) +1;
        this.name = "not set";
        this.feeState = 0;
        this.card = new LibCard();
    }

    public LibUser(String name) {
        this.id = (int)(Math.random()*((99999-10000)+1)) +1;
        this.name = name;
        this.feeState = 0;
        this.card = new LibCard();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFeeState() {
        return feeState;
    }

    public void setFeeState(int feeState) {
        this.feeState = feeState;
    }

    public LibCard getCard() {
        return card;
    }

    public void setCard(LibCard card) {
        this.card = card;
    }

    public void setCardValid(boolean state) { this.card.setValid(state); }
}
