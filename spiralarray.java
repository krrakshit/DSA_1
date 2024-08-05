public class spiralarray {
    public static void main(String[] args) {
        int ar[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int sr = 0;
        int sc = 0;
        int er = ar.length-1;
        int ec = ar[0].length-1;
        while (sr<=er && sc<=ec){
            for (int j = sc;j<=ec;j++) {
                System.out.print(ar[sr][j] + " ");
            }
            for (int i = sr+1;i<=er;i++){
                    System.out.print(ar[i][ec] + " ");
            }
            for (int j = ec-1;j>=sc;j--){
                System.out.print(ar[sr][j]+" ");
            }
            for (int i = er-1;i>=sr;i--){
                System.out.print(ar[i][sc]+" ");
            }
            sc++;
            sr++;
            ec--;
            er--;
        }
        System.out.println();
    }
}
