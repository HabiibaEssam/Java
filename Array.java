import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = input.nextInt();

        int[] marks = new int[n];
        int sum = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        int passCount = 0;
        int failCount = 0;

        for (int i = 1; i < n; i++) {
            System.out.print("Enter mark for student " + i + ": ");
            marks[i] = input.nextInt();
            sum += marks[i];

            if (marks[i] > highest) {
                highest = marks[i];
            }
            if (marks[i] < lowest) {
                lowest = marks[i];
            }

            if (marks[i] >= 50) {
                passCount++;
            } else {
                failCount++;
            }
        }

        double average = (double) sum / n;

        System.out.println("Results");

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + i + ": " + marks[i]);
        }

        System.out.println("Average mark: " + average);
        System.out.println("Highest mark: " + highest);
        System.out.println("Lowest mark: " + lowest);
        System.out.println("Number of students passed: " + passCount);
        System.out.println("Number of students failed: " + failCount);

        input.close();
    }
}

