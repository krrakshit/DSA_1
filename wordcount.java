public class wordcount {
    public static int icount(String str) {
        int count = 1;
        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "hello its me";
        System.out.println(icount(str));
    }
}
