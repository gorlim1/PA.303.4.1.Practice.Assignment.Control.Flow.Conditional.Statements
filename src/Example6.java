import java.util.Scanner;

public class Example6 {

    public static void main(String[] args) {
        int scannedInteger;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer from 1 to 7:");
        scannedInteger = scanner.nextInt();

        while (scannedInteger < 1 || scannedInteger > 7) {
            System.out.println("Out of range");
            scannedInteger = scanner.nextInt();
        }

        switch (scannedInteger) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
        }
    }
}
