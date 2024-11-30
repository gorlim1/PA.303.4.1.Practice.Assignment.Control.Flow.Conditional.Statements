import java.util.Scanner;

public class Example5 {

    public static void main(String[] args) {

        int scannedGrade;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numerical score you achieved, from 0 to 100: ");
        scannedGrade = scanner.nextInt();

        while (scannedGrade < 0 || scannedGrade > 100) {
            System.out.println("Please re-enter a numerical score between 0 and 100: ");
            scannedGrade = scanner.nextInt();
        }

        if (scannedGrade >= 90 && scannedGrade <= 100) {

            System.out.println("Your numerical score " + scannedGrade + " is an A");
        }

        else if (scannedGrade >= 80 && scannedGrade < 90) {

            System.out.println("Your numerical score " + scannedGrade + " is a B");
        }
        else if (scannedGrade >= 70 && scannedGrade < 80) {

            System.out.println("Your numerical score " + scannedGrade + " is a C");
        }

        else if (scannedGrade >= 60 && scannedGrade < 70) {
            System.out.println("Your numerical score " + scannedGrade + " is a D");
        }

        else {
            System.out.println("Your numerical score " + scannedGrade + " is a F");
        }
    }
}