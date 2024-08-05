import java.util.Scanner;

public class a7q4 {
    public static double min(double []ar) {
        double t = ar[0];
        for (int j = 1; j < 10; j++) {
            if (t > ar[j]) {
                t = ar[j];
            }
        }
        return t;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double []n = new double[10];
        System.out.println("enter elements of array");
        for (int i = 0;i<n.length;i++){
            n[i] = sc.nextDouble();
        }
        System.out.println("smallest element is"+min(n));
    }

}
