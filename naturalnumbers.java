import java.util.Scanner;

public class naturalnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        int num = 1;
        while (num <= n){
          //  System.out.println(num);
            sum = num + sum;
            num++;
        }

         System.out.println(sum);
    }
}
