import java.util.Scanner;

public class insertionsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int []ar = new int[n];
        System.out.println("enter the elements of array");
        for (int i = 0;i<ar.length;i++){
            ar[i] = sc.nextInt();
        }
        for (int i = 1;i<ar.length;i++){
            int cur = ar[i];
            int prev = i-1;
            while (prev>=0 && ar[prev] > cur){
                ar[prev+1] = ar[prev];
                prev--;
            }
            ar[prev+1] = cur;

        }
        for (int i = 0;i<ar.length;i++){
            System.out.println(ar[i]+" ");
        }
    }
}
