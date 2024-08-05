import java.util.Scanner;

public class strgs {
    public static void printletter(String str){
        for (int i = 0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
       /* char ar[] = {'a','b','c','d'};
        String st = "abcd";
        String str2 = new String("xyz");
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println(name);
*/
       // String fullname = "hello me";
        // System.out.println(fullname.length());
    /* concatenation
        String fname = "kumar";
        String lname = "rakshit";
        String fullname = fname+" "+lname;
        System.out.println(fullname);
    */
        // charat
        String fname = "kumar";
        String lname = "rakshit";
        String fullname = fname+" "+lname;

        printletter(fullname);
    }
}
