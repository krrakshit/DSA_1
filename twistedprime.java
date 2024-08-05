import java.util.Scanner;
public class twistedprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int flag = 0;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            int rev = 0;
            int temp = num;
            while (num != 0) {
                int r = num % 10;
                rev = (rev * 10) + r;
                num = num / 10;
            }
            int flag1 = 0;
            for (int i = 2; i <= rev / 2; i++) {
                if (rev % i == 0) {
                    flag1 = 1;
                    break;
                }
            }
            if (flag1 == 0) {
                System.out.println("twisted prime");
            } else {
                System.out.println("not twisted");
            }
        }
        else {
            System.out.println("not twisted prime");
        }
    }
}
