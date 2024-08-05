import java.util.Scanner;
public class arinsert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int [] ar = new int[n+1];
        System.out.println("enter the elements of array");
        for (int i = 0;i<ar.length;i++){
            ar[i] = sc.nextInt();
        }
        System.out.println("enter value to insert");
        int key = sc.nextInt();
        System.out.println("enter the index of the value");
        int index = sc.nextInt();
        for (int i = n;i>index;i--){
            ar[i] = ar[i-1];
        }
        ar[index] = key;
        System.out.println("new array is");
        for (int i = 0;i<=n;i++){
            System.out.println(ar[i]+"");
        }
    }
}
