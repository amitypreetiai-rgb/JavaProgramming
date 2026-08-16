package Module1;

public class Q32 {
    public static void main(String[] args) {
        int totalMarks = 450, maxMarks = 500;

        double percentage = (totalMarks * 100.0) / maxMarks;
        int remaining = maxMarks - totalMarks;
        System.out.println("Marks scored : " + totalMarks);
        System.out.println("Marks remaining : " + remaining);
        System.out.println("Percentage : " + percentage + "%");

        System.out.println("Pass? : " + (percentage >= 35));
        System.out.println("Fail? : " + (percentage <= 35));

        boolean hasAttendance = true;
        boolean hasSubmitted  = true;
        System.out.println("Eligible for exam? : " + (hasAttendance && hasSubmitted));
        System.out.println("Eligibility? : " + (hasAttendance || hasSubmitted));
        System.out.println("Debarred? : " + (!hasAttendance));
    }
}
