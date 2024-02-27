import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;
        String ans;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter desired year: ");
        year = Integer.parseInt(scanner.nextLine());

        if (year % 4 == 0 || year % 400 == 0) {
            ans = String.format("The year %d is considered a leap year", year);

        } else {
            ans = String.format("The year %d is not considered a leap year", year);
        }

        System.out.print(ans);
    }
}