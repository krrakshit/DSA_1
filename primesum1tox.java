import java.util.Scanner;
public class primesum1tox {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the value of x");
            int x = sc.nextInt();
            int sum = 0;
            for (int i = 2; i <= x; i++) {
                int flag = 0;
                for (int j = 2;j<=i/2;j++){
                    if (i%j==0){
                        flag = 1;
                        break;
                    }
                }
                if (flag ==0 && i!=1){
                    sum += i ;
                }
            }
            System.out.println(sum+"");
        }
}

