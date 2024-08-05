public class fnprimerange {
    public static boolean prime(int n) {
        int flag = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = 1;
                return false;
            }
        }
        return true;

    }
    public static void primeinrange(int n) {
        for (int i = 2;i<=n;i++){
            if (prime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        primeinrange(100);
    }
}