package Module1;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a prime number or not: ");
        int num = sc.nextInt();

        int divisor = 2;
        boolean isPrime = num > 1;

        while (divisor * divisor <= num) {
            if (num % divisor == 0) {
                isPrime = false;
                break;
            }
            divisor++;
        }

        System.out.println(num + (isPrime ? " is a Prime number" : " is not a prime number"));
        sc.close();
    }
}
