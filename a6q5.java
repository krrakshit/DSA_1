import java.util.Scanner;

public class a6q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of sides and side length of a polygon:");
        int n=sc.nextInt();
        double s=sc.nextDouble();
        double ar=area(n,s);
        System.out.println("Area of polygon is:"+ar);
    }
    public static double area(int n, double s)
    {
        return (n*s*s)/(4*Math.tan(Math.PI/n));
    }
}
