package Loops;

import java.util.Scanner;

public class Armstrong_Number_between_two_numbers {
    public static void main(String[] args) {
        System.out.print("Enter the Number1=");
        Scanner in = new Scanner(System.in);
        int num1= in.nextInt();
        System.out.print("Enter the Number2=");
        int num2= in.nextInt();
        int multiply;
        int sum=0;
        while(num1 < num2){
            num1++;
            int z=num1;
            int s=z%10;
            multiply=s*s*s;
            sum+=multiply;
            if(sum<num2){
                System.out.println(sum);
            }
            z=z/10;
            num1+=z;
        }


    }
}
