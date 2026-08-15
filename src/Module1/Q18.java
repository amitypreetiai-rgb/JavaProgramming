package Module1;

public class Q18 {
    public static void main(String[] args) {
        int[] arr = {78, 92, 65, 88, 55, 97, 73};
        int largest = arr[0], smallest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) { 
                largest = arr[i]; 
                }
            if (arr[i] < smallest)  { 
                smallest  = arr[i]; 
                }
        }

        System.out.println("Largest number:" +largest);
        System.out.println("Smallest number:" +smallest);
    }
}
