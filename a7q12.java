public class a7q12 {
    public static void selsort(int ar[]){
        for (int i = 0;i<ar.length-1;i++){
            int minp = i;
            for (int j = i+1;j<ar.length;j++){
                if (ar[minp] > ar[j]){
                    minp = j;
                }
            }
            int temp = ar[minp];
            ar[minp] = ar[i];
            ar[i] = temp;
        }
        for (int i = 0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
    public static void main(String[] args) {
        int []ar = {4,5,2,7,8,1,3};
        selsort(ar);
    }
}
