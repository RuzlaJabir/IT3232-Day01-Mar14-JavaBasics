public class Grocery extends Product{
    private String brand;

    public Grocery(String name, double price, int quantity, String brand)
    {
        super(name, price, quantity);
        this.brand = brand;
    }

    @Override
    public void displayDetails()
    {
        System.out.println("Grocery: " + getName() + " - Price: Rs." + getPrice() + ", Quantity: " + getQuantity() + ", Brand: " + brand);
    }
}