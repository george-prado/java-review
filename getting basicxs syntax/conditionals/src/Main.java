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


        /*
        About the Math class

        Math.floor = double return
        Math.ceil = double return
        Math.round = long return
        Math.random = double return
         */

        System.out.print(m);
    }
}