package Loops;

import java.util.Scanner;

public class Input_a_number_and_print_all_the_factors_of_that_number {
    public static void main(String[] args) {
        System.out.print("enter the number-");
        Scanner input = new Scanner(System.in);
        int num= input.nextInt();
//                while(temp>0){
//            if(num%temp==0){
//                System.out.print(temp+" ");
//            }
//            temp-=1;
        for(int temp=num;temp>0;temp-=1) {
            if (num % temp == 0) {
                System.out.print(temp + " ");
            }
        }

    }
}
