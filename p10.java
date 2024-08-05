import java.util.Scanner;

public class p10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        int ans = 1;
        while (ans*3<=num){
            ans*=3;
        }
        System.out.println(ans);
    }
}
