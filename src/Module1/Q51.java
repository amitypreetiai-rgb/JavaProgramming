package Module1;

public class Q51 {
    public static void main(String[] args) {
        String text = "This  is \n java lab";
        String[] words = text.split("\\s+");
        
        for (String word : words) {
            System.out.println(word);
        }
    }
}
