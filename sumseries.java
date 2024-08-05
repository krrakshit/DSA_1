import java.util.Scanner;
public class sumseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of terms:");
        int n = sc.nextInt();
        int sign = 1;
        int sum = 0;
        int i = 1;
        int x = 1;
        while (i<=n){
            sum = sum+(sign*x);
            x = x+2;
            sign = -sign;
            i++;
        }
        System.out.println("the sum of terms is : " + sum);
    }
}
