import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] m = new int[n][n];
        int top = 0, bottom = n-1, left = 0, right = n-1, num = 1;

        while (num <= n * n) {
            for (int i = left; i <= right; i++)  m[top][i]    = num++;
            top++;
            for (int i = top; i <= bottom; i++)  m[i][right]  = num++;
            right--;
            for (int i = right; i >= left; i--)  m[bottom][i] = num++;
            bottom--;
            for (int i = bottom; i >= top; i--)  m[i][left]   = num++;
            left++;
        }

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (j > 0) sb.append(" ");
                sb.append(m[i][j]);
            }
            System.out.println(sb);
        }

        int diag = 0;
        for (int i = 0; i < n; i++) diag += m[i][i];
        System.out.println("Diagonal: " + diag);
    }
}
