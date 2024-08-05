import java.util.Scanner;
public class minorp1 {

    class Problem_ConvertToAnyBase
    {
        public static void main (String[] args)
        {
            Scanner sc=new Scanner (System.in);
            System.out.println("Enter the value of decimal integer");
            int n=sc.nextInt();
            System.out.println("Enter the value of base");
            int b=sc.nextInt();
            String result = convertToAnyBase(n, b);
            System.out.println("Decimal: " + n + " in base " + b + " is " + result);
        }

        public static String convertToAnyBase(int n, int b) {
            if (n == 0)
            {
                return "0"; // Special case for zero
            }

            String result = "";
            String symbols = "0123456789ABCDEF"; // Digits and letters used for bases up to 16

            while (n > 0)
            {
                int remainder = n % b;
                result=symbols.charAt(remainder)+result;
                n /= b;
            }

            return result;
        }
    }

}
