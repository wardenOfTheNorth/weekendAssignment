import java.util.Scanner;

class Product {
    private long id;
    private String productName;

    public Product() {

    }

    Product(long id, String productName) {
        this.id = id;
        this.productName = productName;
        this.supplierName = "Nivas";
    }

    Product(long id, String productName, String supplierName) {
        this.id = id;
        this.productName = productName;
        this.supplierName = supplierName;
    }

    private String supplierName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    void display() {
        System.out.println("Product id is " + id);
        System.out.println("Product Name is " + productName);
        System.out.println("Supplier Name is " + supplierName);
    }
}

public class Problem26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product id");
        long pid = sc.nextLong();
        System.out.println("Enter product name");
        String pname = sc.next();
        System.out.println("Is the product supplied by Nivas Suppliers? Type yes or no (not case sensitive)");
        boolean byNivas = sc.next().toLowerCase().equals("yes");
        Product product = new Product(pid, pname);
        if (!byNivas) {
            System.out.println("Enter supplier name");
            product = new Product(pid, pname, sc.next());
        }
        product.display();
    }
}