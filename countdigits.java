import java.util.Scanner;

public class countdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numberofdig = 0;
        int original_n = n;

        while (n>0) {
            n = n / 10;
            numberofdig++;
        }
        System.out.println("Number of digits in  " + original_n + "=" + numberofdig);
    }
}
