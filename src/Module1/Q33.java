package Module1;

public class Q33 {
    public static void main(String[] args) {
        String grade1 = "A";
        String grade2 = "A";
        String grade3 = new String("A");

        System.out.println("grade1 == grade2 (same address) : " + (grade1 == grade2));
        System.out.println("grade1 == grade3 (different address)  : " + (grade1 == grade3));
        System.out.println("grade1.equals(grade3) (same value): " + grade1.equals(grade3));
    }
}
