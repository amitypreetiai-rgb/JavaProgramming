package Module1;

public class Q49 {
    public static void main(String[] args) {
        String str1 = "Hello";
        System.out.println("Initial string: " + str1);

        str1.concat(" World");
        System.out.println("\nEditing string (doesn't change): ");
        System.out.println("str1 = " + str1);
        
        String str2 = str1.concat(" World");
        System.out.println("\nAfter creating str2 and concat():");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
    }
}
