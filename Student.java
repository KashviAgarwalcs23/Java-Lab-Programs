import java.util.Scanner;

class Subject {
    int subjectMarks;
    int credits;
    int grade;

    public void calculateGrade() {
        if (subjectMarks < 40)
            grade = 0;
        else if (subjectMarks > 100)
            grade = 4; // Invalid grade, assuming it’s an error
        else {
                 if (subjectMarks >= 90)
                grade = 10;
            else if (subjectMarks >= 80)
                grade = 9;
            else if (subjectMarks >= 70)
                grade = 8;
else if (subjectMarks >= 60)
                grade = 7;
else if (subjectMarks >= 50)
                grade = 6;
else if (subjectMarks >= 40)
                grade = 5;
            else
                grade = -1;
        }
    }
}

class Student1 {
    String name;
    String usn;
    double SGPA;
    Subject subject[];
    Scanner s;
    Student1() {
        subject = new Subject[8];
        for (int i = 0; i < 8; i++) {
            subject[i] = new Subject();
        }
        s = new Scanner(System.in);
    }

 
    public void getStudentDetails() {
        System.out.print("Enter student name: ");
        this.name = s.nextLine();
        System.out.print("Enter student USN: ");
        this.usn = s.nextLine();
    }

   
    public void getMarks() {
        for (int i = 0; i < 8; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            subject[i].subjectMarks = s.nextInt();
            System.out.print("Enter credits for subject " + (i + 1) + ": ");
            subject[i].credits = s.nextInt();
            subject[i].calculateGrade();
        }
        s.nextLine();
    }

    public void computeSGPA() {
        double totalPoints = 0;
        int totalCredits = 0;
       
        for (int i = 0; i < 8; i++) {
            totalPoints += subject[i].grade * subject[i].credits;
            totalCredits += subject[i].credits;
        }
       
        SGPA = (totalCredits == 0) ? 0 : totalPoints / totalCredits;    }

 
    public void displayResults() {
        System.out.println("Student Name: " + name);
        System.out.println("USN: " + usn);
        System.out.printf("SGPA: %.2f%n", SGPA);
    }
}

public class Student {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.getStudentDetails();
        s1.getMarks();
        s1.computeSGPA();
        s1.displayResults();
   System.out.println("Name: Kashvi Agarwal");
System.out.println("USN: 1BM23CS142");
}
}
