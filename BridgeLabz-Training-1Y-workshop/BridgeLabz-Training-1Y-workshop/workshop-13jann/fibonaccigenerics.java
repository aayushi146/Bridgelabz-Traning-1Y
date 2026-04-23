public class fibonaccigenerics {

    public static <T> void fibbo(T a) {

        int n = Integer.parseInt(a.toString()); // convert T to int

        int x = 0, y = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(x + " ");
            int temp = x + y;
            x = y;
            y = temp;
        }
    }

    public static void main(String[] args) {

        fibbo(7);
    }
}
