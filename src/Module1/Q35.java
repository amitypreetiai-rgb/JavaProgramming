package Module1;

public class Q35 {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        System.out.println("Initial values:");
        System.out.println("a = " + a + " (Binary: " + Integer.toBinaryString(a) + ")");
        System.out.println("b = " + b + " (Binary: " + Integer.toBinaryString(b) + ")");

        int andResult = a & b;
        System.out.println("a & b (AND)   = " + andResult);

        int orResult = a | b; 
        System.out.println("a | b (OR)    = " + orResult);

        int xorResult = a ^ b; 
        System.out.println("a ^ b (XOR)   = " + xorResult);

        int notResult = ~a;   
        System.out.println("~a (NOT)      = " + notResult);

        int leftShift = a << 1; 
        System.out.println("a << 1 (Left) = " + leftShift);

        int rightShift = a >> 1; 
        System.out.println("a >> 1 (Right)= " + rightShift);
    }
}
