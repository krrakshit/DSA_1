import java.util.Scanner;
public class amicable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number");
        int num1 = sc.nextInt();
        System.out.println("enter 2nd number");
        int num2 = sc.nextInt();
        int sum1 = 0;int sum2 = 0;
        for (int i = 1; i <= num1/2; i++){
            if (num1%i==0){
                sum1 +=i;
            }
        }
        for (int i = 1;i <= num2/2;i++){
            if (num2%i==0){
                sum2 +=i;
            }
        }
        if (sum1 == num2 && sum2 == num1){
            System.out.println("numbers are amicable");
        }
        else {
            System.out.println("not emicable");
        }
    }
}
