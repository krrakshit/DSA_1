import java.util.Scanner;

public class arraypair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int []ar = new int[n];
        System.out.println("enter the elements of array");
        for (int i = 0;i<ar.length;i++){
            ar[i] = sc.nextInt();
        }
        for (int i = 0;i<ar.length;i++){
            int cur = ar[i];
            for (int j = i+1;j<ar.length;j++){
                System.out.print("("+cur+","+ar[j]+")");
            }
            System.out.println();
        }
    }
}
