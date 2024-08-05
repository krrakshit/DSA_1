import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the year which you want to check");
        int num = sc.nextInt();
        if(num % 4 == 0){

        
           if (num%100==0 ){
            if (num%400==0) {
                System.out.println("leap year");
            }
            else {
                System.out.println("not leap");
            }
        }
            else{
                System.out.println("leap year");
            } 
        }   
        else{
            System.out.println(num + " is non leap year");
        }
    }

}
