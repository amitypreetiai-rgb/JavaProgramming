package Module1;

public class Q47 {
    public static void main(String[] args) {
        String str = "Java";
        int len = str.length();
        char[] reversed = new char[len];

        for (int i = 0; i < len; i++) {
            reversed[i] = str.charAt(len - 1 - i);
        }

        String reversedStr = new String(reversed);
        System.out.println("String: " + str);
        System.out.println("Reversed: " + reversedStr);
    }
}
