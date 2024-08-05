import java.util.Scanner;
public class matrixsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter dimension of array");
        int [][]ar = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        System.out.println("enter value to be searched");
        int key = sc.nextInt();
        int row = 0;
        int col = ar[0].length-1;
        while (row<ar.length && col>=0){
            if (ar[row][col]==key){
                System.out.println("found key at : " + row +"," + col);
                break;
            } else if (key<ar[row][col]) {
                col--;
            }
            else {
                row++;
            }
        }

    }
}
