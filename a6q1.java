import java.util.Scanner;

public class a6q1 {
    public static int add(int x,int y){
        return x+y;
    }
    public static int sub(int x,int y){
        return x-y;
    }
    public static int mul(int x,int y){
        return x*y;
    }
    public static int div(int x,int y){
        return x/y;
    }
    public static int mod(int x,int y){
        return x%y;
    }
    public static double sqr(int x){
        return Math.sqrt(x);
    }
   public static void main(String []args){
       Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a");
        int a = sc.nextInt();
        System.out.println("enter the value of b");
        int b = sc.nextInt();
       System.out.println("enter the character");
        char ch = sc.next().charAt(0);
       switch (ch){
           case '+':
               System.out.println(add(a,b));
               break;
           case '-':
               System.out.println(sub(a,b));
               break;
           case '*':
               System.out.println(mul(a,b));
               break;
           case '/':
               System.out.println(div(a,b));
               break;
           case '%': if ((a==0)||(b==0)){
               System.out.println("invalid");
           }
           else {
               System.out.println(mod(a,b));
           }
               break;
           case 'r':
               System.out.println(sqr(a));
               break;
           default :
               System.out.println("enter a valid operator");
       }
   }

    public static class a6h3 {
    }
}
