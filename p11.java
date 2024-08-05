import java.util.Scanner;

public class p11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int ans = 0,index=0,temp=num;
        while (num>0){
            int z = num%10;
            if (z!=0){
                ans += (int)(z*Math.pow(10,index));
                index++;
            }
            num=num/10;
        }
        System.out.println(ans);
    }
}
