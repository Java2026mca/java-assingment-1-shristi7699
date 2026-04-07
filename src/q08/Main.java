import java.util.*;

public class Main {
    static int[] stack = new int[1000];
    static int top = -1;

    static void push(int x) { stack[++top] = x; }
    static int pop()        { return top < 0 ? Integer.MIN_VALUE : stack[top--]; }
    static int peek()       { return top < 0 ? Integer.MIN_VALUE : stack[top]; }
    static int size()       { return top + 1; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String op = sc.next();
            if (op.equals("PUSH")) {
                push(sc.nextInt());
            } else if (op.equals("POP")) {
                int v = pop();
                System.out.println(v == Integer.MIN_VALUE ? "EMPTY" : v);
            } else if (op.equals("PEEK")) {
                int v = peek();
                System.out.println(v == Integer.MIN_VALUE ? "EMPTY" : v);
            } else if (op.equals("SIZE")) {
                System.out.println(size());
            }
        }
    }
}
