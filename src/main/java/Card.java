abstract public class Card {

    private String cardNumber;
    private String expiryDate;
    private int securityNumber;

    public Card(String cardNumber, String expiryDate, int securityNumber) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.securityNumber = securityNumber;
    }
}
