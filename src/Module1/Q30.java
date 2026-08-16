package Module1;

public class Q30 {
    public static void main(String[] args) {
        int[] numarr = {100, 110, 120, 130, 140, 150};
        int searchnum = 120;

        int low = 0, high = numarr.length - 1, result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (numarr[mid] == searchnum){
                 result = mid; 
                 break; 
                 }
            else if (numarr[mid] < searchnum) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        
        System.out.println(result != -1
            ? "Number " + searchnum + " found at index " + result
            : "Number " + searchnum + " not found");
    }
}
