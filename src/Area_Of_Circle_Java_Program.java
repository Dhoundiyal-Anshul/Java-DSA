import java.util.Scanner;

public class Area_Of_Circle_Java_Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius= ");
        int a = in.nextInt();
        Float area= (float) (a*a*3.14);
        System.out.println(area);
    }
}

