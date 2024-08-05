public class div3and5and10row {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i%3==0 || i%5==0) {
                    System.out.print(i+",");
                    counter++;
            }
            if (counter==10){
                System.out.println();
                counter = 0;
            }
        }
    }
}