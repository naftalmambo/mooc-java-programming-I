import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private GradeRegister list;

    public UserInterface(Scanner scanner, GradeRegister list) {
        this.scanner = scanner;
        this.list = list;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            String input = scanner.nextLine();
            int points = Integer.valueOf(input);

            if (points == -1) {
                break;

            }

            this.list.add(points);

        }

        System.out.println("Point average (all): " + this.list.average());
        double passingAvg = this.list.passAverage();

        if (passingAvg == -1.0) {
            System.out.println("Point average (passing): " + "-");

        } else {
            System.out.println("Point average (passing): " + passingAvg);

        }

        System.out.println("Pass percentage: " + this.list.passPercentage());

        System.out.println("Grade distribution:");

        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");

            int starsCount = this.list.countGrades(i);
            while (starsCount > 0) {
                System.out.print("*");
                starsCount--;

            }
            System.out.println();

        }

    }
}
