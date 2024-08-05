import java.util.Scanner;

public class perfect1tox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of x");
        int x = sc.nextInt();
        for (int j = 1;j<=x;j++){
            int n = j;
            int sum = 0;
            for (int i = 1;i<=n/2;i++){
                if (n%i==0){
                    sum +=i;
                }
            }
            if (sum==n){
                System.out.println(n+"");
            }
        }
    }
}
