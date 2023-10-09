import java.util.Scanner;

public class fibonacci_using_for {
    public static void main(String[] args) {
                                                                // 0,1,1,2,3,5,8
        System.out.print("Enter the Term=");
        Scanner in = new Scanner(System.in);                   // a=0  b=1 z=a+b
        int n = in.nextInt();
        int a ;
        int b = 1;
        int z = 0; //a+b
        int term;
        for(term=1;term<=n;term++){
            System.out.println(z+" ");
            a=b;
            b=z;
            z=b+a;
        }
    }
}

