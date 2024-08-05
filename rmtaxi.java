import java.util.Scanner;
public class rmtaxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter base");
        int b = sc.nextInt();
        System.out.println("enter power");
        int p = sc.nextInt();
        int ans = 1;
        for (int i = 0;i<p;i++){
            ans*=b;
        }
        System.out.println(ans);

    }

}