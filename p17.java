import java.util.Scanner;

public class p17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = num;i>=1;i--){
            for (int j = i;j>=1;j--){
                sum+=j;
            }
        }
        System.out.println(sum);
    }
}
