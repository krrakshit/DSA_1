import java.util.Scanner;
public class primebetween {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        for (int i = a+1;i<=b;i++){
            int flag = 0;
            for (int j = 2;j<=i/2;j++){
                if (i%j==0){
                    flag = 1;
                    break;
                }
            }
            if(flag==0){
                System.out.print(i+"");
            }
        }

    }
}
