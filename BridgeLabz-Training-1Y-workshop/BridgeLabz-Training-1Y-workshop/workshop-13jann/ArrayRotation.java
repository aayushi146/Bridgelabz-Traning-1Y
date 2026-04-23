import java.util.*;

public class ArrayRotation {
    public static void leftRotate(int[] arr, int n) {
        int first = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = first;
    }

    public static void rightRotate(int[] arr, int n) {
        int last = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        leftRotate(arr, n);
        for (int i : arr) System.out.print(i + " ");

        System.out.println();

        rightRotate(arr, n);
        for (int i : arr) System.out.print(i + " ");
    }
}
