import java.util.Scanner;

public class a6h4 {
    public static int words(String s){
        int c = 1;
        for (int i = 0;i<s.length();i++){
            if (s.charAt(i)==' ' && s.charAt(i+1)!=' '){
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String str = sc.nextLine();
        System.out.println("the number of words is :"+ words(str));

    }
}
