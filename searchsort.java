import java.util.Scanner;
public class searchsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int []ar = new int[n];
        System.out.println("enter the elements of array");
        for (int i = 0;i<ar.length;i++){
            ar[i] = sc.nextInt();
        }
        for (int i = 0;i<n-1;i++){
            int minp = i;
            for (int j = i+1;j<n-1;j++){
                if (ar[minp] > ar[j]){
                    minp = j;
                }
            }
            int temp = ar[minp];
            ar[minp] = ar[i];
            ar[i] = temp;
        }
        for (int i = 0;i<ar.length;i++){
            System.out.println(ar[i]+" ");
        }
    }
}
