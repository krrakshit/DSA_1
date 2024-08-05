public class fndectobin {
    public static void dectobin(int n){
        int pow = 0;
        int binm = 0;
        while (n>0){
            int rem = n%2;
            binm = binm + (rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println(binm);
    }

    public static void main(String[] args) {
        dectobin(14);
    }
}
