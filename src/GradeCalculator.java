import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        int subjectCount = sc.nextInt();
        sc.nextLine();

        String[] subjects = new String[subjectCount];
        int[] marks = new int[subjectCount];

        int total = 0;

        for (int i = 0; i < subjectCount; i++) {

            System.out.print("Enter name of Subject " + (i + 1) + ": ");
            subjects[i] = sc.nextLine();

            System.out.print("Enter marks for " + subjects[i] + ": ");
            marks[i] = sc.nextInt();
            sc.nextLine();

            while (marks[i] < 0 || marks[i] > 100) {

                System.out.print("Invalid marks. Enter marks between 0 and 100: ");
                marks[i] = sc.nextInt();
                sc.nextLine();
            }

            total = total + marks[i];
        }

        double average = (double) total / subjectCount;

        String grade;

        if (average >= 90) {
            grade = "A+";
        } else if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\n----- RESULT -----");

        System.out.println("Student Name: " + name);
        System.out.println("Number of Subjects: " + subjectCount);

        System.out.println("\nSubject-wise Marks:");

        for (int i = 0; i < subjectCount; i++) {
            System.out.println(subjects[i] + ": " + marks[i]);
        }

        System.out.println("\nTotal Marks: " + total + "/" + (subjectCount * 100));
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);

        if (average >= 50) {
            System.out.println("Status: PASS");
        } else {
            System.out.println("Status: FAIL");
        }

        sc.close();
    }
}