package Module1;

class Student {
    private String name;
    private int marks;
    private String grade;

    public Student(String name, int marks) {
        this.name = name;
        setMarks(marks);
    }

    public String getName() { return name; }
    public int getMarks() { return marks; }

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
            if (marks >= 90) grade = "A+";
            else if (marks >= 75) grade = "A";
            else if (marks >= 60) grade = "B";
            else grade = "C";
        } else {
            System.out.println("Invalid marks entered");
        }
    }

    public String getGrade() { return grade; }
}

public class Q1 {
    public static void main(String[] args) {
        Student s = new Student("Preeti", 85);
        System.out.println("Name: " + s.getName());
        System.out.println("Marks: " + s.getMarks());
        System.out.println("Grade: " + s.getGrade());
        s.setMarks(95);
        System.out.println("Updated Grade: " + s.getGrade());
    }
}
