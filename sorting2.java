
import java.util.*;

class Product {
    int id;
    String name;
    int price;

    Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + price;
    }
}

class ProductComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {

        // Price: High to Low
        if (p1.price != p2.price) {
            return p2.price - p1.price;
        }

        // Same price: Name A-Z
        return p1.name.compareTo(p2.name);
    }
}

public class sorting2 {
    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product(1, "Laptop", 60000));
        products.add(new Product(2, "Mobile", 60000));
        products.add(new Product(3, "Tablet", 30000));
        products.add(new Product(4, "Mouse", 1000));

        products.sort(new ProductComparator());

        for (Product p : products) {
            System.out.println(p);
        }
    }
}