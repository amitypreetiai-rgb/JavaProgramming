package Module1;

public class Q14 {
    public static void main(String[] args) {
        int marks = 90;
        String grade;
        if (marks >= 90) {
            grade = "A+";
        }
        else if (marks >= 80) {
            grade = "A";
        }
        else if (marks >= 70) {
            grade = "B+";
        }
        else if (marks >= 60) {
            grade = "B";
        }
        else if (marks >= 50) {
            grade = "C";
        }
        else {
            grade = "F";
        }
        System.out.println("Marks: " + marks + "\nGrade: " + grade);

        int year = 3;
        switch (year) {
            case 1:
            System.out.println("Year 1: Operating Systems");   
            break;
            case 2: 
            System.out.println("Year 2: Java");
            break;
            case 3: 
            System.out.println("Year 3: Data Structures");     
            break;
            case 4: 
            System.out.println("Year 4: Algorithms");          
            break;
            default: 
            System.out.println("Invalid Year");
        }

        String[] subjects = {"Java", "Python", "C", "Networks", "Aptitude"};
        int[] scores = {92, 85, 78, 88, 95};
        int total = 0;
        System.out.println("\n--- Marksheet ---");
        for (int i = 0; i < subjects.length; i++) {
            System.out.printf("%s: %d\n", subjects[i], scores[i]);
            total += scores[i];
        }
        System.out.println("Total: " + total);
        System.out.println("Average: " + (total / subjects.length));
    }
}
