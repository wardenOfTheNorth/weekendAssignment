import java.util.Scanner;

class userMainCode31 {
    double percentagef(int no, int price, int sellPrice) {
        double pricePerToy = price / 12.0;
        double result = (sellPrice - pricePerToy) * 100 / pricePerToy;
        return result;
    }
}

public class Problem31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of dozens of toys purchased");
        int no = sc.nextInt();
        System.out.println("Enter the price per dozen");
        int price = sc.nextInt();
        System.out.println("Enter the selling price of 1 toy");
        int sellPrice = sc.nextInt();
        double percentage = percentagef(no, price, sellPrice);
        System.out.println(percentage);
    }
}
