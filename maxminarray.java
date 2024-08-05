import java.util.Scanner;

public class maxminarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int []ar = new int[n];
        System.out.println("enter the elements of array");
        for (int i = 0;i<ar.length;i++){
            ar[i] = sc.nextInt();
        }
        int max = ar[0];
        for (int i = 0;i<ar.length;i++){
            if (ar[i]>max){
                max = ar[i];
            }
        }
        System.out.println("maximum"+max);

    }
}
