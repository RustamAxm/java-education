//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /** docs
     */
    public static boolean doubleExpression(double a, double b, double c) {
        double epsilon = 1e-10;
        return Math.abs(a + b -c) < epsilon;
    }

    public static int flipBit(int value, int bitIndex) {
        return value ^ (1 << (bitIndex - 1)); // put your implementation here
    }

    public static boolean isPowerOfTwo(int value) {
        value = Math.abs(value);
        int count = Integer.bitCount(value);
        return count == 1; // you implementation here
    }

    public static boolean isPalindrome(String text) {
        text = text.replaceAll("[^a-zA-Z0-9]", "");
        text = text.toLowerCase();
        for (int i = 0; i < text.length() / 2; i++ ) {
            if (text.charAt(i) != text.charAt(text.length() - i -1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam, I'm Adam!"));
    }
}