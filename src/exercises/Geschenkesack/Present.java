package exercises.Geschenkesack;

public class Present {
    private final String descriptionM;
    private final double priceInEuro;
    private final Person sender;
    private final Person recipient;

    public Present(String descriptionM, double priceInEuro, Person sender, Person recipient) {
        this.descriptionM = descriptionM;
        this.priceInEuro = priceInEuro;
        this.sender = sender;
        this.recipient = recipient;
    }
    public String getDescriptionM() {
        return descriptionM;
    }
    public double getPriceInEuro() {
        return priceInEuro;
    }
    public Person getSender() {
        return sender;
    }
    public Person getRecipient() {
        return recipient;
    }
}
