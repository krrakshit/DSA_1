public class a6q2 {
    public static int pent(int n){
        int a = (n*(3*n-1)/2);
        return a;
    }

    public static void main(String[] args) {
        for (int i = 1;i<101;i++){
            System.out.print(pent(i)+" ");
            if (i%10==0){
                System.out.println();
            }
        }
    }
}
