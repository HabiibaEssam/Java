import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int count = 0;

        if (num == 0) {
            count = 1;
        } else {
            while (num != 0) {
                num /= 10;
                count++;
            }
        }

        System.out.println("Number of digits: " + count);
    }
}
