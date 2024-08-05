public class fnoverflow {
    public static void area(int r){
        double res = 3.14*(r*r);
        System.out.println(res);
    }
    public static void area(double b,double h){
        double res = 0.5*b*h;
        System.out.println(res);
    }
    public static  void area(int l,int b){
        int res = l*b;
        System.out.println(res);
    }

    public static void main(String[] args) {
        area(5);
        area(10,5);
        area(5.3,4.5);
    }
}
