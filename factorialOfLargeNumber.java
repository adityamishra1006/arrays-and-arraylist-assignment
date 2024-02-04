// Understand this code later


import java.util.Arrays;
public class factorialOfLargeNumber {

    static void findFactorial(int n) {
        int[] result = new int[10000];
        Arrays.fill(result, 0);

        // Initialize the result with 1
        result[0] = 1;
        int resultSize = 1;

        // Multiply numbers from 2 to n
        for (int i = 2; i <= n; i++) {
            resultSize = multiply(result, i, resultSize);
        }

        // Print the result
        System.out.println("Factorial of " + n + " is:");
        for (int i = resultSize - 1; i >= 0; i--) {
            System.out.print(result[i]);
        }
    }

    static int multiply(int[] result, int x, int resultSize) {
        int carry = 0;

        // Multiply each digit of the result with x
        for (int i = 0; i < resultSize; i++) {
            int product = result[i] * x + carry;
            result[i] = product % 10;
            carry = product / 10;
        }

        // Handle the remaining carry
        while (carry > 0) {
            result[resultSize] = carry % 10;
            carry = carry / 10;
            resultSize++;
        }

        return resultSize;
    }

    public static void main(String[] args) {
        int n = 100; // Change this to the desired number
        findFactorial(n);
    }
}


