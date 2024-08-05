import java.util.Scanner;

public class a7q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []ar = new int[10];
        System.out.println("enter the elements of array");
        for (int i = 0;i<ar.length;i++){
            ar[i] = sc.nextInt();
        }
        System.out.println("enter element to be searched");
        int n = sc.nextInt();
        int c = 0;
        for (int i = 0;i<10;i++){
            if (ar[i]==n){
                c++;
            }
        }

        if (c==1){
            System.out.println("element is present");
        } else if (c>1) {
            System.out.println("found element"+c+"times");
        }
        else {
            System.out.println("element not found");
        }
    }
}
