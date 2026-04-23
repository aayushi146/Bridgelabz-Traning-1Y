import java.util.*;

public class FriendlyPair {
    static int sumDiv(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (sumDiv(a) / (double) a == sumDiv(b) / (double) b)
            System.out.println("Friendly Pair");
        else
            System.out.println("Not Friendly Pair");
    }
}