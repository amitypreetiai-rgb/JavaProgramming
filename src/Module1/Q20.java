package Module1;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int num1 = sc.nextInt(), num2 = sc.nextInt(), num3 = sc.nextInt();

        int largest;

        if (num1 >= num2 && num1 >= num3) { 
            largest = num1; 
            }
        else if (num2 >= num1 && num2 >= num3) { 
            largest = num2; 
            }
        else { 
            largest = num3; 
            }

        System.out.println(largest + " is largest");
        sc.close();
    }
}
