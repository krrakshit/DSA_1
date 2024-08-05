import java.util.Scanner;

public class a7q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []count = new int[101];
        System.out.println("enter integers from 1 to 100 ending with 0");
        int num;
        do {
            num = sc.nextInt();
            if (num>=1 && num<= 100){
                count[num] ++;
            } else if (num!=0) {
                System.out.println("invalid input");
            }
        }
        while (num!=0);
        System.out.println("occurence of integers between 1 and 100");
        for (int i = 1;i<=100;i++){
            if (count[i]>0){
                System.out.println(i+":"+count[i]+"times");
            }
        }


    }
}
