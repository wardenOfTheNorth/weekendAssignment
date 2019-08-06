import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem34 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> stringList = new ArrayList<String>();
        
        int enteredChoice = -1;
        String str;
        while (enteredChoice != 5) {
            System.out.println("1.Insert 2. Search 3. Delete 4. Display 5. Exit");
            System.out.print("Enter your choice : ");
            enteredChoice = sc.nextInt();
            switch (enteredChoice) {
            case 1: // Insert
                System.out.print("Enter the item to be inserted : ");
                str = sc.next();
                stringList.add(str);
                System.out.println("Item inserted successfully");
                break;
            case 2: // Search
                System.out.print("Enter item to search : ");
                str = sc.next();
                if (stringList.contains(str))
                    System.out.println("Item found in the list");
                else
                    System.out.println("Item not found in the list");
                break;
            case 3: // Delete
                System.out.print("Enter the item to delete : ");
                str = sc.next();
                if (stringList.contains(str)) {
                    stringList.remove(str);
                    System.out.println("Item deleted successfully");
                } else
                    System.out.println("Item not found in the list");
                break;
            case 4:// Display
                System.out.println("The items in the list are : ");
                for (String s : stringList)
                    System.out.println(s);
                break;
            case 5: // Exit
                break;
            }
        }

    }

}
