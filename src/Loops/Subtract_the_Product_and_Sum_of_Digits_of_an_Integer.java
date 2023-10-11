import java.util.Scanner;

public class Subtract_the_Product_and_Sum_of_Digits_of_an_Integer {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the Number=");
        int num= in.nextInt();
        int sum=0;
        int product=1;
        while(num>0) {
            int temp = num % 10;
            sum += temp;
            product *= temp;
            num= num/10;
        }
        System.out.println(product-sum);


    }
}
