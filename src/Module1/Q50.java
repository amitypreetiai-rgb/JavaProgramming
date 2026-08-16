package Module1;

public class Q50 {
    public static void main(String[] args) {
        String str = "abcba";
        
        if (isPalindrome(str)) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } 
        else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }

        String reversed = new StringBuilder(str).reverse().toString();

        return str.equals(reversed);
    }
}
