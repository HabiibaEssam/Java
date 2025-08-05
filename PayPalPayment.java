public class PayPalPayment implements Payment {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        if (validatePayment()) {
            System.out.println("Processing PayPal payment of $" + amount);
        } else {
            System.out.println("PayPal account validation failed.");
        }
    }

    @Override
    public boolean validatePayment() {
        return email != null && email.contains("@");
    }
}