import java.util.Scanner;

public class a7q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int []ar = new int[n];
        System.out.println("enter the elements of array");
        for (int i = 0;i<ar.length;i++){
            ar[i] = sc.nextInt();
        }
        for (int p = 0;p<n;p++){
            for (int i = 0;i<n-1;i++){
                if (ar[i]>ar[i+1]){
                    int temp = ar[i];
                    ar[i] = ar[i+1];
                    ar[i+1] = temp;
                }

            }
        }
        System.out.println("2nd largest element is "+ar[n-2]);
    }
}
