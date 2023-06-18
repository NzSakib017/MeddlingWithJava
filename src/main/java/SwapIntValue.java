//Suppose, a=10 and b=20. Now swap the value using a temp variable. Output: a=20, b=10

public class SwapIntValue {
    public static void main(String[] args) {
        int a = 10, b = 20;
        doTheSwap(a, b);
    }

    static void doTheSwap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("The swapped numbers are, A: " + a + ", B: " + b);
    }
}
