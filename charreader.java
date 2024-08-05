import java.util.Scanner;

public class charreader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a character");
        char ch = sc.next().charAt(2);
        System.out.println("the character is :" + ch);
    }
}
