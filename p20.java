import java.util.Scanner;

public class p20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of m");
        int m = sc.nextInt();
        System.out.println("enter value of n");
        int n = sc.nextInt();
        for (int i = m;i<=n;i++){
            int fact = 1;
            for (int j = 1;j<=i;j++){
                fact*=j;
            }
            System.out.println("factoriial of"+i+"is"+fact);
        }
    }
}
