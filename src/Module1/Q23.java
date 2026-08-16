package Module1;

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms for Fibonacci series: ");
        int n = sc.nextInt();

        long prev = 0, curr = 1;
       
        for (int i = 1; i <= n; i++) {
            System.out.println("Term " + i + " : " + prev);
            long next = prev + curr;
            prev = curr;
            curr = next;
        }
        sc.close();
    }
}
