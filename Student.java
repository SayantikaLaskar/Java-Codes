import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    private String name;
    private int grade;
    private ArrayList<String> courses;

    // Constructor
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    // Method to add a course
    public void addCourse(String course) {
        if (!courses.contains(course)) {
            courses.add(course);
            System.out.println(course + " added to " + name + "'s courses.");
        } else {
            System.out.println(name + " is already enrolled in " + course + ".");
        }
    }

    // Method to remove a course
    public void removeCourse(String course) {
        if (courses.contains(course)) {
            courses.remove(course);
            System.out.println(course + " removed from " + name + "'s courses.");
        } else {
            System.out.println(name + " is not enrolled in " + course + ".");
        }
    }

    // Method to display student information
    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Courses: " + courses);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Student 1
        System.out.print("Enter name for Student 1: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter grade for Student 1: ");
        int grade1 = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Student student1 = new Student(name1, grade1);

        // Input for courses for Student 1
        System.out.print("Enter courses for " + name1 + " (comma-separated): ");
        String coursesInput1 = scanner.nextLine();
        String[] coursesArray1 = coursesInput1.split(",");
        for (String course : coursesArray1) {
            student1.addCourse(course.trim());
        }

        // Display information for Student 1
        student1.displayStudentInfo();
        System.out.println();

        // Input for Student 2
        System.out.print("Enter name for Student 2: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter grade for Student 2: ");
        int grade2 = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Student student2 = new Student(name2, grade2);

        // Input for courses for Student 2
        System.out.print("Enter courses for " + name2 + " (comma-separated): ");
        String coursesInput2 = scanner.nextLine();
        String[] coursesArray2 = coursesInput2.split(",");
        for (String course : coursesArray2) {
            student2.addCourse(course.trim());
        }

        // Display information for Student 2
        student2.displayStudentInfo();

        scanner.close();
    }
}

