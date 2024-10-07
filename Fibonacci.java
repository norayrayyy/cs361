import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter integer to compute fibonacci sequence: ");
        int number = scnr.nextInt();
        System.out.println("Input for Fibonacci: " + number + "\nOutput: " + fibonacci(number));
    }
}