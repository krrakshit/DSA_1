import java.util.Scanner;

public class countingsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int []ar = new int[n];
        System.out.println("enter the elements of array");
        for (int i = 0;i<ar.length;i++){
            ar[i] = sc.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        for (int i = 0;i<ar.length;i++){
            largest = Math.max(largest,ar[i]);
        }
        int count[] = new int[largest+1];
        for (int i = 0;i<ar.length;i++){
            count[ar[i]]++;
        }
        int j = 0;
        for (int i = 0;i<count.length;i++){
            while (count[i] > 0) {
                ar[j] = i;
                j++;
                count[i]--;
            }
        }
        for (int i = 0;i<ar.length;i++){
            System.out.println(ar[i]+" ");;
        }

    }
}
