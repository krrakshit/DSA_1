import java.util.Scanner;

public class p13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        double sum =0;
        for (double i = 1;i<=num;i++){
            double ans = 1/(i*i);
            sum +=ans;
        }
        System.out.println(sum);
    }
}
