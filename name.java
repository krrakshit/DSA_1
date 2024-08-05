import java.util.Scanner;
public class name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        System.out.println("enter the digit");
        int dig = sc.nextInt();
        int c = 0;
        while (num!=0){
          int rem = num%10;
             if (rem == dig){
                 c++;
             }
            num = num/10;
        }
        System.out.println(c);
    }
}
