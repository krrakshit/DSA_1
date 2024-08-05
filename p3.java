import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int sum = 0;
        while (num>0){
            int r = num%10;
            sum += r;
            num/=10;
        }
        if (sum%9==0){
            System.out.println("divisble by 9");
        }
        else {
            System.out.println("not divisble");
        }
    }
}