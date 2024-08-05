import java.util.Scanner;
public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number between 1 to 9");
        int num = sc.nextInt();
        int a = (int)(1+(9-1)*Math.random());
        System.out.println("computer guess " + a);
        if (num == a) {
            System.out.println("right");
        }
            else if ((num+1 == a) || (num-1 == a)) {
                System.out.println("got it right");
            }
        else {
            System.out.println("wrong");
        }
    }
}
