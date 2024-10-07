import java.util.Scanner;

public class InnerOuter {
    public static int innerMost(int n) {
        System.out.println("Innermost Order: " + n);

        if (n <= 1) {
            System.out.println();
            System.out.println("Base case is met at: " + n);
            return 1;
        }

        int result = n * innerMost(n - 1);
        System.out.println("Innermost Results: " + n + ", " + result);
        return (result);
    }

    public static int outerMost(int n) {
        System.out.println("Outermost Order: " + n);

        if (n <= 1) {
            System.out.println();
            System.out.println("Base case is met at: " + n);
            return 1;
        }

        int temp = outerMost(n - 1);
        int result = n * temp;
        System.out.println("Outermost Results: " + n + ", " + result);
        return result;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter a number to evaluate innermost: ");
        int number = scnr.nextInt();
        int innerResults = innerMost(number);
        System.out.println("Innermost results: " + innerResults);

        System.out.println("----------------------------");

        System.out.println("Enter a number to evaluate outmost: ");
        number = scnr.nextInt();
        int outerResults = outerMost(number);
        System.out.println("Outermost results: " + outerResults);

       
    }
}
