public class fnbinomial {
    public static int factorial(int n){
        int f = 1;
        for (int i = 1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static int bincoeff(int n,int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binc = fact_n/(fact_r*fact_nmr);
        return binc;
    }

    public static void main(String[] args) {
        System.out.println(bincoeff(6,3));
    }
}
