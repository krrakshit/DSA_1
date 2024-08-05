import java.util.Scanner;

public class p12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num");
        int num = sc.nextInt();
        int nsum = 0;
        int sum = 0;
        for (int i = 1;i<=num;i++){
            nsum +=i*i;
            sum+=i;
        }
        System.out.println(nsum-(sum*sum));
    }
}
