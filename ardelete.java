import java.util.Scanner;
public class ardelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int []ar = new int[n];
        System.out.println("enter the elements of the array");
        for (int i = 0;i<ar.length;i++){
            ar[i] = sc.nextInt();
        }
        System.out.println("enter the index to delete");
        int index = sc.nextInt();
        for (int i = index;i<n-1;i++){
            ar[i] = ar[i+1];
        }
        System.out.println("new array is :");
        for (int i = 0;i<n-1;i++){
            System.out.println(ar[i]+" ");
        }
    }
}

