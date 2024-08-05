import java.util.Scanner;

public class p14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = sc.nextInt();
        System.out.println("enter second number");
        int num2 = sc.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1;i<=num1;i++){
            if ((num1%i)==0){
                sum1+=i;
            }
        }
        for (int j =1;j<=num2;j++){
            if ((num2%j)==0){
                sum2+=j;
            }
        }
        if (sum1==sum2){
            System.out.println("amicable number");
        }
        else{
            System.out.println("not");
        }
    }
}
