package Loops;

import java.util.Scanner;

public class fibonacci_using_while {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the term= ");
        int n = in.nextInt();
        int a;
        int b=1;
        int z=0;
        int term=0;
        while(term<=n){
            System.out.print(z+" ");
            a=b;
            b=z;
            z=b+a;
            term++;
        }
    }



}
