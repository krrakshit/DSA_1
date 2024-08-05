import java.util.Scanner;

public class dsasq {
    public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  the dimension of 2D array");
		int row = sc.nextInt(); 
		int column = sc.nextInt();
		int[][]ar = new int [row+1][column];
		System.out.println("enter  the element of 2D array");
		
		for(int i = 0;i<row;i++) {
			for(int j = 0;j<column;j++) {
				ar[i][j] = sc.nextInt();
		}   
	}
		for(int i = 0;i<row;i++) {
			for(int j = 0;j<column;j++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
	}
		
		
	for(int i = 0;i<row;i++) {
		int sum = 0;
			for(int j = 0;j<column;j++) {
				sum+=ar[j][i];
			}
				 ar[row][i] = sum;
	}
	for(int i = 0;i<=row;i++) {
		for(int j = 0;j<column;j++) {
			System.out.print(ar[i][j]+" ");
		}
		System.out.println();
	}
	} 
}
