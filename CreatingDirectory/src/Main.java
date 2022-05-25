import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ProductManager productManager = new ProductManager();
        String path = "main.txt";
        Product p1 = new Product("Product 1", 1.00, "Test");
        Product p2 = new Product("Product 2", 2.00, "Test1");
        Product p3 = new Product("Product 3", 3.00, "Test2");

        productManager.add(p1);
        productManager.add(p2);
        productManager.add(p3);

        productManager.saveToFile(path);
        productManager.readFromFile(path);

    }

}
