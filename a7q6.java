import java.util.Scanner;

public class a7q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int []ar = new int[n];
        System.out.println("enter the elements of array");
        for (int i = 0;i<ar.length;i++){
            ar[i] = sc.nextInt();
        }
        int first = 0;int last = ar.length-1;
        while (first<last){
            int temp = ar[last];
            ar[last] = ar[first];
            ar[first] = temp;
            first++;
            last--;
        }
        for (int i = 0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
}
