import java.util.Scanner;
public class transpose {
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
        for (int i = 0;i<row;i++){
            for (int j = i+1;j<column;j++) {
                int temp = ar[i][j];
                ar[i][j] = ar[j][i];
                ar[j][i] = temp;
            }
        }
        for (int i = 0;i<row;i++){
            for (int j = 0;j<column;j++) {

                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
}
