import java.util.Scanner;
public class palendrum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int rev = 0;int temp = num;int rem = 0;
        while (num != 0){
             rem = num%10;
            rev = (rev*10)+rem;
            num = num/10;
        }
        if (temp==rev){
            System.out.println("palendrum");
        }
        else{
            System.out.println("not");
        }
    }
}
