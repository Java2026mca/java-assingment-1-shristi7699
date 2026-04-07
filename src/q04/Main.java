import java.util.*;

public class Main {

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    static boolean isPerfect(int n) {
        if (n < 2) return false;
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) sum += n / i;
            }
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            boolean p = isPrime(x), f = isPerfect(x);
            if (p && f)       System.out.println("Both");
            else if (p)       System.out.println("Prime");
            else if (f)       System.out.println("Perfect");
            else              System.out.println("Neither");
        }
    }
}
