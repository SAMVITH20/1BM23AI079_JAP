import java.util.Vector;
class Product {
    String name;
    double price;
    String category;
    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;

    }
}

public class p5 {
    private Vector<Product> inventory;

    public p5() {
        inventory = new Vector<>();
    }

    public void addProduct(String name, double price, String category) {
        Product product = new Product(name, price, category);
        inventory.add(product);
    }

    public void removeProduct(String name) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).name.equalsIgnoreCase(name)) {
                inventory.remove(i);
                break;
            }
        }
    }

    public void displayInventory() {
        System.out.println("Inventory:");
        for (Product product : inventory) {
            System.out.println("Name: " + product.name + ", Price: " + product.price + ", Category: " + product.category );
        }
    }

    public static void main(String[] args) {
        p5 manager = new p5();

        manager.addProduct("Laptop", 40000, "Electronics");
        manager.addProduct("T-shirt", 550, "Clothing");
        manager.addProduct("Book", 920, "Books");
        manager.displayInventory();

        manager.removeProduct("Book");

        manager.displayInventory();

        manager.removeProduct("Laptop");

        manager.displayInventory();
    }
}