import java.util.ArrayList;
import java.util.List;

public class RetailStore{
    private List<Product> products;

    public RetailStore(){
        products = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void editProduct(String name, double newPrice, double newQuantity)
    {
        for(Product product : products)
        {
            if(product.getName().equalsIgnoreCase(name))
            {
                product.setPrice(newPrice);
                product.setQuantity((int)newQuantity);
                System.out.println("Updated " + name + " successfully.");
                return;
            }
        }
        System.out.println("Product not found.");

    }

    public void deleteProduct(String name)
    {
        products.removeIf(product -> product.getName().equalsIgnoreCase(name));
        System.out.println(name + " removed from store.");
        
    }

    public void displayProducts(){
        if(products.isEmpty()){
            System.out.println("No products available.");
            return;
        }
        for(Product product : products){
            product.displayDetails();
        }
    }
}