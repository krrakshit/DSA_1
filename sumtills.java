import java.util.Scanner;

public class sumtills {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        int s = 0;
        while (num>10){
            while (num>0){
                int d = num%10;
                s+=d;
                num= num/10;
            }
        }
        System.out.println(s);
    }
}
