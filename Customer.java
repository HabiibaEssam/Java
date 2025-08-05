public class Customer extends User {
    public Customer(String username, String email) {
        super(username, email);
    }


    @Override
    public String getUserDetails() {
        return "Customer -> " + super.getUserDetails();
    }

    public void placeOrder() {
        System.out.println("Order placed by customer.");
    }


    public void placeOrder(Product product, int quantity) {
        if (product.getStock() >= quantity) {
            product.setStock(product.getStock() - quantity);
            System.out.println("Customer " + username + " ordered " + quantity + " of " + product.getName());
        } else {
            System.out.println("Not enough stock for " + product.getName());
        }
    }
}