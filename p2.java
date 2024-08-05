import java.util.Scanner;
public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        if ((num % 5==0)&&(num % 6==0)){
            System.out.println("divisble by both");
        }
        else if ((num % 5==0)||(num % 6==0)){
            System.out.println("divisble by or");
        }
        else if ((num % 5==0)^(num % 6==0)){
            System.out.println("nor divisble");
        }
    }
}
