import java.util.Scanner;

public class power3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int c = 1;
        int temp = 1;
        while (c <= n) {
            temp = c;
            c *= 3;
        }
            System.out.println(temp);
    }
}
