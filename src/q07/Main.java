import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int swaps = 0;

        // Insertion Sort (count shifts)
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; // shift
                swaps++;             // count shift
                j--;
            }

            arr[j + 1] = key;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i > 0) sb.append(" ");
            sb.append(arr[i]);
        }

        System.out.println(sb);
        System.out.println("Swaps: " + swaps);
    }
}
