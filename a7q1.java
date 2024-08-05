import java.util.Scanner;

public class a7q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        double []ar = new double[n];
        for (int i = 0;i<ar.length;i++){
            ar[i] = Math.random();
        }
        double sum = 0.0;
        for (int i = 0;i<ar.length;i++){
            sum+=ar[i];
        }
        System.out.println("suum is :" + sum);
        System.out.println("avg is : " + (sum/n));
    }
}
