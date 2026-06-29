import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Double> grades = new ArrayList<>();

        System.out.print("Kitne students hain? ");
        int n = sc.nextInt();
        sc.nextLine();

        // Input lena
        for (int i = 0; i < n; i++) {
            System.out.print("Student ka naam: ");
            String name = sc.nextLine();
            System.out.print("Grade dalo: ");
            double grade = sc.nextDouble();
            sc.nextLine();
            names.add(name);
            grades.add(grade);
        }

        // Calculate karna
        double sum = 0, highest = grades.get(0), lowest = grades.get(0);
        for (double g : grades) {
            sum += g;
            if (g > highest) highest = g;
            if (g < lowest) lowest = g;
        }
        double average = sum / n;

        // Report dikhana
        System.out.println("\n===== Student Report =====");
        for (int i = 0; i < n; i++) {
            System.out.println(names.get(i) + " : " + grades.get(i));
        }
        System.out.println("Average: " + average);
        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);
    }
} 