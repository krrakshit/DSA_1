import java.util.Scanner;

public class p8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value ");
        int n = sc.nextInt();
        int ans = 1;
        for (int i = 1;i<=10;i++){
            ans = i*n;
            System.out.println(n+"*"+i+"="+ans);
        }
    }
}
