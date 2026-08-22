package Module2.functionalcalculator;

public class CalculatorMain {
    public static void main(String[] args) {

        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;
        Calculator multiplication = (a, b) -> a * b;

        System.out.println("Addition: " + addition.compute(10, 5));
        System.out.println("Subtraction: " + subtraction.compute(10, 5));
        System.out.println("Multiplication: " + multiplication.compute(10, 5));
    }
}