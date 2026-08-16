package Module1;

public class Q36 {
    public static void main(String[] args) {
        System.out.println("Multiplication (*) has higher precedence than Addition (+):");
        int result1 = 10 + 5 * 2; 
        System.out.println("10 + 5 * 2 = " + result1);

        System.out.println("\nUsing parentheses:");
        int result2 = (10 + 5) * 2; 
        System.out.println("(10 + 5) * 2 = " + result2);

        System.out.println("\nDivision (/) and Multiplication (*) have the same precedence so left to right associativity:");
        int result3 = 20 / 4 * 2; 
        System.out.println("20 / 4 * 2 = " + result3);

        System.out.println("\nArithmetic operators have higher precedence than relational operators:");
        boolean result4 = 10 + 5 > 3 * 4; 
        System.out.println("10 + 5 > 3 * 4 = " + result4);

        System.out.println("\nLogical AND (&&) has higher precedence than Logical OR (||)");
        boolean result5 = true || false && false; 
        System.out.println("true || false && false = " + result5);
    }
}
