public class Q08_Main{
    public static void main(String args[])
    {
        RetailStore store = new RetailStore();

        //Adding products
        store.addProduct(new Fruit("Apple", 1.5, 50, "Winter"));
        store.addProduct(new Vegetable("Carrot", 0.8, 30, true));
        store.addProduct(new Grocery("Rice", 2.5, 100, "Araliya"));

        //Displaying all products
        System.out.println("Available Products:");
        store.displayProducts();

        //Editing a product
        System.out.println("\nEditing Apple price and quantity...");
        store.editProduct("Apple", 1.8, 40);

        //Displaying updated product
        System.out.println("\nUpdated Products:");
        store.displayProducts();

        //Deleting a product
        System.out.println("\nDeleting Carrot...");
        store.deleteProduct("Carrot");

        //Displaying final list of products
        System.out.println("\nFinal Product List:");
        store.displayProducts();

    }
}