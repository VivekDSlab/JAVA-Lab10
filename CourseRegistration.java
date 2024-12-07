import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String usn;
    private String name;
    private ArrayList<String> courses;

    public Student(String usn, String name) {
        this.usn = usn;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void registerCourses(ArrayList<String> courses) {
        this.courses.addAll(courses);
    }

    public void displayDetails() {
        System.out.println("\nStudent Registration Details");
        System.out.println("----------------------------");
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        System.out.println("Courses Registered:");
        for (String course : courses) {
            System.out.println("- " + course);
        }
    }
}

public class CourseRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Course Registration");
        System.out.print("Enter USN: ");
        String usn = scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        Student student = new Student(usn, name);

        System.out.print("Enter the number of courses to register: ");
        int numCourses = scanner.nextInt();
        scanner.nextLine(); // Clear the buffer

        ArrayList<String> courses = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            System.out.print("Enter course " + (i + 1) + ": ");
            String course = scanner.nextLine();
            courses.add(course);
        }

        student.registerCourses(courses);
        student.displayDetails();

        scanner.close();
    }
}
