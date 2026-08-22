package Module2.exceptions;

public class DivisionMain {
    public static void main(String[] args) {

        System.out.println("try-catch");
        tryCatch(10, 0);

        System.out.println();

        System.out.println("try-catch-finally");
        tryCatchFinally(10, 0);
    }

    public static void tryCatch(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public static void tryCatchFinally(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block is executed, even if exception occurs.");
        }
    }
}