import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int x = sc.nextInt();
        System.out.println("enter second number");
        int y = sc.nextInt();
        int n;
        do{
            n = x%y;
            x = y;
            y = n;
        }
        while (n!=0);
        System.out.println("GCD is " + x);
    }
}
