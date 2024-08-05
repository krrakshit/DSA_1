import java.util.Scanner;

public class a6q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        if(isPalindrome(n))
            System.out.println(n+" is a pallindrome number");
        else
            System.out.println(n+" is not a pallindrome number");
    }
    public static boolean isPalindrome(int n)
    {
        int rev=reverse(n);
        if(n==rev)
            return true;
        else
            return false;
    }
    public static int reverse(int n)
    {
        int rev=0;
        while(n!=0)
        {
            rev=rev*10+n%10;
            n=n/10;
        }
        return rev;
    }
}
