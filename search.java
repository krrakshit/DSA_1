import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int []ar = new int[n];
        System.out.println("enter the elements of array");
        for (int i = 0;i<ar.length;i++){
            ar[i] = sc.nextInt();
        }
        System.out.println("enter the element too be searches");
        int key = sc.nextInt();
        int flag = 0;
        for (int i = 0;i<ar.length;i++){
            if (ar[i]==key){
                flag = 1;
                break;
            }
        }
        if (flag==1){
            System.out.println("searching is successful");
        }
        else {
            System.out.println("searching unsuccessful");
        }
    }
}
