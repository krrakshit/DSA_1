public class multiple5and7 {
    public static void main(String[] args) {


        int num = 1;


        while(true){
            if((num % 7 == 0) && (num % 5 == 0)){
                System.out.println("found ans" + num);
               // break;
            }
            num++;
        }

    }
}
