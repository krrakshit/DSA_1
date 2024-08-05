import java.util.Scanner;

public class nrandomarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        double sum = 0.0;
        double []ar = new double[n];
        for (int i = 0;i<ar.length;i++){
            ar[i] = Math.random();
        }
        for (int i = 0;i<ar.length;i++){
            sum +=ar[i];
        }
        double avg = sum/ar.length;
        System.out.println("sum is ; "+sum +","+"avg is : "+ avg);
    }
}
