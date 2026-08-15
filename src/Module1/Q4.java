package Module1;

class AdvancedMathOperations extends Q4 {

    @Override
    int calculate(int a, int b) {
        System.out.print("Advanced\n");
        return a + b + 10; 
    }

    int calculate(int a, int b, int c) {
        return a + b + c;
    }
}

public class Q4 {

  
    int calculate(int a, int b) {
        return a + b;
    }

    double calculate(double a, double b) {
        return a * b;
    }

    int calculate(int a, int b, int operationType) {
        if (operationType == 1) return a - b;
        return (b != 0) ? (a / b) : 0;
    }

    public static void main(String[] args) {
        Q4 m = new Q4();
        System.out.println("Sum:" + m.calculate(10, 5));
        System.out.println("Product:" + m.calculate(4.5, 2.0));
        System.out.println("Subtraction:" + m.calculate(20, 4, 1));
        System.out.println("Division:" + m.calculate(20, 4, 2));

        System.out.println();

        AdvancedMathOperations am = new AdvancedMathOperations();
        System.out.println("Overridden calc:" + am.calculate(20, 10));
        System.out.println("3-arg overload:" + am.calculate(10, 20, 30));
        System.out.println("Inherited double:" + am.calculate(3.5, 2.0));
    }
}


