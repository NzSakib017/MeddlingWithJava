//Suppose a=15.5276. print the value upto 2 decimal point. Output: a=15.52

public class PrintingValueUptoTwoDecimalPoint {
    public static void main(String[] args) {
        float a = 15.5276f;
        System.out.println("Value Up-to Two Decimal Point is: " + String.format("%.2f", a));

        int temp = (int) (a * 100);
        a = (float) temp / 100;

        System.out.println("Value Up-to Two Decimal Point is: " + a);
    }
}

