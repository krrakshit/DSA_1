import java.util.Scanner;

public class mathtable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a  b    Math.pow(a,b)");
        System.out.println(a + "  " + b + "    " + Math.pow(a,b));
        a = a+1;
        b = b+1;
        System.out.println(a + "  " + b + "    " + Math.pow(a,b));
        a = a+1;
        b = b+1;
        System.out.println(a + "  " + b + "    " + Math.pow(a,b));
        a = a+1;
        b = b+1;
        System.out.println(a + "  " + b + "    " + Math.pow(a,b));
        a = a+1;
        b = b+1;
        System.out.println(a + "  " + b + "    " + Math.pow(a,b));

    }
}
