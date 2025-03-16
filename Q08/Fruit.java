public class Fruit extends Product{
    private String season;

    public Fruit(String name, double price, int quantity,String season)
    {
        super(name,price,quantity);
        this.season = season;
    }

    @Override
    public void displayDetails()
    {
        System.out.println("Fruit: " + getName() + " - Price: Rs." + getPrice() + ", Quantity: " + getQuantity() + ", Season: " + season);
    }
}