import java.util.Scanner;
public class decimaltobinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int res = 0;
        int prod = 1;
        while (num!=0) {
            int r = num % 2;
            res = (r * prod + res);
            prod = prod * 10;
            num = num / 2;
        }
        System.out.println(res);
    }
}
