package Loops;

import java.util.Scanner;

public class LCM_Of_Two_Numbers_Euclidean_Algorithm {
    public static void main(String[] args) {
        System.out.print("Enter the first Number=");
        Scanner in = new Scanner(System.in);               //LCM(a,b)=(a*b/GCD(a,b)
        int  a = in.nextInt();                             //GCD(a, b) = GCD(b,a%b) Continue until b becomes 0.
        System.out.print("Enter the second Number=");      //Now, we replace a with b and b with the result of a % b:
        int b = in.nextInt();                              //Since b is now 0, we stop. The value of a is the GCD
        //HCF Of Two Numbers Program

    }
}
