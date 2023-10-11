package Loops;

import java.util.Scanner;

public class Find_if_a_number_is_palindrome_or_not {
    public static void main(String[] args) {
        // 121,1331,12321,55555,9009 these type of numbers are palindrome numbers
        System.out.print("Enter the Number=");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int reverse=0;
        int num2=num;
        while(num2>0){
            int temp = num2%10;
            reverse = (reverse*10)+temp;
            num2=num2/10;
        }
        if(reverse == num){
            System.out.println("It's a Palindrome");
        }
        else{
            System.out.println("Sorry It's not a Palindrome");
        }
    }
}
