package Module2.customexceptions;

public class CheckAgeMain {
    public static void checkAge(int age) throws InvalidAgeEx {
        if (age < 18) {
            throw new InvalidAgeEx("Age must be 18 or above. Provided age: " + age);
        }
        System.out.println("Age is valid: " + age);
    }

    public static void main(String[] args) {

        try {
            checkAge(20);
            checkAge(15);
        }
        catch (InvalidAgeEx e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}