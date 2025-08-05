public class Admin extends User {
    public Admin(String username, String email) {
        super(username, email);
    }

    @Override
    public String getUserDetails() {
        return "Admin -> " + super.getUserDetails();
    }

    public void updateProduct(Product product, double newPrice, int newStock) {
        product.setPrice(newPrice);
        product.setStock(newStock);
        System.out.println("Product updated by admin " + username);
    }
}
