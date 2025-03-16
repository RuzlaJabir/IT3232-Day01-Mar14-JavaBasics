public class Vegetable extends Product {
    private boolean isOrganic;

    public Vegetable(String name, double price, int quantity, boolean isOrganic) {
        super(name, price, quantity);
        this.isOrganic = isOrganic;
    }

    @Override
    public void displayDetails() {
        System.out.println("Vegetable: " + getName() + " - Price: Rs." + getPrice() + ", Quantity: " + getQuantity() + ", Organic: " + (isOrganic ? "Yes" : "No"));
    }
}
