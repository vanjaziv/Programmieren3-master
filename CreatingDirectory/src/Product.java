public class Product {

    String ProductName;
    double price;
    String ProductCategory;

    public Product(String productName, double price, String productCategory) {
        ProductName = productName;
        this.price = price;
        ProductCategory = productCategory;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ProductName='" + ProductName + '\'' +
                ", price=" + price +
                ", ProductCategory='" + ProductCategory + '\'' +
                '}';
    }
}
