
import java.util.Scanner;

public class Area_Of_Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Length= ");
        int L = in.nextInt();
        System.out.print("Enter Breadth= ");
        int B = in.nextInt();
        int C = L*B;
        System.out.println((float)0.5*C);

    }
}
