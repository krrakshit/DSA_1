public class fnprimecheck {
    public static boolean prime(int n){
        int flag = 0;
        for (int i = 2;i<=n/2;i++){
            if (n%i==0){
                flag = 1;
                return false;
            }
        }
       return true;
    }

    public static void main(String[] args) {
        System.out.println(prime(15));
    }
}
