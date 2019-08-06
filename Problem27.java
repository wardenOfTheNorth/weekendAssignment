import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

class Author implements Comparable<Author> {
    private String name;
    private String email;
    private String gender;

    Author() {

    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Author(String name, String email, String gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public int compareTo(Author o) {
        return 0;
    }
}

class Book {
    private String name;
    private List<Author> authorList;
    private double price;
    private int qtyInStock = 0;

    public Book(String name, List<Author> authorList, double price) {
        this.name = name;
        this.authorList = authorList;
        this.price = price;
    }

    public Book(String name, List<Author> authorList, double price, int qtyInStock) {
        this.name = name;
        this.authorList = authorList;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public List<Author> getAuthorList() {
        return authorList;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    @Override
    public String toString() {
        StringBuilder ats = new StringBuilder();
        for (Author author : authorList) ats.append(author.getName());
        return name + " authored by " + ats.toString() + " costs Rs." + price + ": " + (qtyInStock == 0 ? "Not Available" : "Available");
    }
}

public class Problem27 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter book name");
        String bname = br.readLine();
        System.out.println("Enter number of authors");
        int n = parseInt(br.readLine());
        List<Author> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Author author = new Author();
            System.out.println("Enter author name");
            author.setName(br.readLine());
            System.out.println("Enter author email id");
            author.setEmail(br.readLine());
            System.out.println("Enter author's gender");
            author.setGender(br.readLine());
            list.add(author);
        }
        System.out.println("Enter book price");
        int bprice = parseInt(br.readLine());
        System.out.println("Is the book currently available? Type “Yes/No” (Not case sensitive)");
        boolean avl = br.readLine().toLowerCase().equals("yes");
        Book book;
        if (avl) {
            System.out.println("Enter the number of books available");
            int bnumber = parseInt(br.readLine());
            book = new Book(bname, list, bprice, bnumber);
        } else {
            book = new Book(bname, list, bprice);
        }
        System.out.println(book.toString());
    }
}