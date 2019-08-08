import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Box {
    double len, wid, hei;

    public Box(double len, double wid, double hei) {
        this.len = len;
        this.wid = wid;
        this.hei = hei;
    }

    @Override
    public boolean equals(Object obj) {
        Box b = (Box) obj;
        return len * hei * wid == b.len * b.hei * b.wid;
    }

    @Override
    public int hashCode() {
        return (int) (len * hei * wid);
    }

    @Override
    public String toString() {
        return "Length = " + len + ", " + "Width = " + wid + ", " + "Height = " + hei + ", " + "Volume = " + (len * hei * wid);
    }
}

public class Problem30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of boxes");
        int n = sc.nextInt();
        Set<Box> boxes = new HashSet<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter box");
            boxes.add(new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
        }
        System.out.println(boxes);
    }
}
