import java.util.Scanner;

public class arraydiagonalsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter dimension of array");
        int row = sc.nextInt();
        int column = sc.nextInt();
        int [][] ar = new int[row][column];
        System.out.println("enter the elements of array");
        for (int i = 0;i<row;i++){
            for (int j = 0;j<column;j++) {
                ar[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0;i<row;i++){
            for (int j = 0;j<column;j++) {
                if(i==j){
                    sum+=ar[i][j];
                }
            }
        }
        double avg = sum/3;
        System.out.println("sum is : " + sum + "avg is : " + avg);
    }
}
