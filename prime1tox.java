public class prime1tox {
    public static void main(String[] args) {
        int[] ar = new int[25];
        int c = 0;
        for (int i = 2; i <= 100; i++) {
            int flag = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                ar[c++] = i;
            }
        }
        for (int i = 0;i<c;i++){
            System.out.print(ar[i]+" ");
        }
    }
}