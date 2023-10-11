import java.util.Scanner;

public class Sum_Of_A_Digits_Of_Number {
    public static void main(String[] args) {
        System.out.print("Enter the Number=");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
//        int sum =0;
//        while (num>0){
//            int temp=num%10;
//            sum+=temp;
//            num=num/10;
//        }
//        System.out.print(sum);
        int sum=0;
        for(;num>0;num=num/10){
            int temp = num%10;
            sum+=temp;
        }
        System.out.println(sum);
    }
}
