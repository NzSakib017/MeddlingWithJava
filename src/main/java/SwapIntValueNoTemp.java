//Suppose, a=10 and b=20. Now swap the value without a temp variable. Output: a=20, b=10

public class SwapIntValueNoTemp {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("The Swapped Numbers Are, A: " + doFirstIntSwap(a, b) + ", B: " + doSecondIntSwap(a, b));

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("The Mathematical Swap Is, A: " + a + ", B: " + b);
    }

    static int doFirstIntSwap(int a, int b) {
        return a = b;
    }

    static int doSecondIntSwap(int a, int b) {
        return b = a;
    }

}
