public class MainA {
    public static void main(String[] args) {
        Product laptop = new Product(1, "Laptop", 1200.0, 5);

        Customer c = new Customer("Habiba", "habiba@email.com");
        c.placeOrder(); // without product
        c.placeOrder(laptop, 2); // with product + quantity

        Admin a = new Admin("Admin1", "admin@email.com");
        System.out.println(c.getUserDetails());
        System.out.println(a.getUserDetails());

        Payment p1 = new CreditCardPayment("1234567890123456");
        p1.processPayment(1500.0);

        Payment p2 = new PayPalPayment("user@paypal.com");
        p2.processPayment(500.0);
    }
}