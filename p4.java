import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int avg = 0,r = 0,p = n;
        do {
            r = (int)(1+(p-1)*Math.random());
            System.out.print(r+"");
            avg += r;
            n = n-1;
        }
        while (n>0);
        System.out.println("average value is" + (avg/p));
    }
}
