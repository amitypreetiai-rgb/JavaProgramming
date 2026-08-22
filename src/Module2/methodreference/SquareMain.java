package Module2.methodreference;

import java.util.function.Function;

public class SquareMain {
    public static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {

        Function<Integer, Integer> squareFun = SquareMain::square;

        int result = squareFun.apply(5);

        System.out.println("Square of 5 is: " + result);
    }
}