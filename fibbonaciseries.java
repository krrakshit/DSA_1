import java.util.Scanner;
public class fibbonaciseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a+""+b);
        for (int i = 3;i<=n;i++){
            int sum = a+b;
            a=b;
            b=sum;
            System.out.print(sum);
        }
    }
}
