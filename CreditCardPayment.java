public class CreditCardPayment implements Payment {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        if (validatePayment()) {
            System.out.println("Processing credit card payment of $" + amount);
        } else {
            System.out.println("Credit card validation failed.");
        }
    }

    @Override
    public boolean validatePayment() {
        return cardNumber != null && cardNumber.length() == 16;
    }
}
