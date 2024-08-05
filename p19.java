import java.util.Scanner;

public class p19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        for (int i = a+1;i<b;i++) {
            int c1 = 0;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    c1++;
                    break;
                }
            }
            if (c1 == 0) {
                System.out.println(i + "");
            }
        }
    }
}
