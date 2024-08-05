import java.util.Scanner;

public class a6q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter password:");
        String pwd=sc.next();
        if(isValidPassword(pwd))
            System.out.println("Valid password");
        else
            System.out.println("invalid password");
    }
    public static boolean isValidPassword(String str)
    {
        if((str.length()>=8)&&(isValidCharacters(str))&&(countDigits(str)>=2))
            return true;
        else
            return false;
    }
    public static boolean isValidCharacters(String str)
    {
        for(int i=0;i<str.length();i++)
        {      
            if(!(str.charAt(i)>='A' && str.charAt(i)<='Z') &&
                    !(str.charAt(i)>='a' && str.charAt(i)<='z') &&
                    !(str.charAt(i)>='0' && str.charAt(i)<='9'))
                return false;
        }
        return true;
    }
    public static int countDigits(String str)
    {
        int c=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>='0' && str.charAt(i)<='9')
                c++;
        }
        return c;
    }
}
