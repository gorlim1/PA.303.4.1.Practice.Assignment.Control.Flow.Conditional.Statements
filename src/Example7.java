import java.util.Scanner;

public class Example7 {

    public static void main(String[] args) {

        //Variable declarations and initializations
        String scannedFillingStatus = "";
        int taxableIncome = 0;
        Scanner scanner = new Scanner(System.in);


        //Prompt user for filing status
        System.out.println();
        System.out.print("Please first enter your filling status: Single, Married Filing Jointly, " +
                "Qualifying Widow, Qualifying Widower,\nMarried Filing Separately, or Head of Household:");
        scannedFillingStatus = scanner.nextLine();

        //Prompt user for filing status checks
        while (!"Single".equalsIgnoreCase(scannedFillingStatus) &&
                !"Married Filing Jointly".equalsIgnoreCase(scannedFillingStatus) &&
                !"Qualifying Widow".equalsIgnoreCase(scannedFillingStatus) &&
                !"Qualifying Widower".equalsIgnoreCase(scannedFillingStatus) &&
                !"Married Filing Separately".equalsIgnoreCase(scannedFillingStatus) &&
                !"Head of Household".equalsIgnoreCase(scannedFillingStatus)) {

            System.out.print("Please re-enter your filling status: Single, Married Filing Jointly, " +
                    "Qualifying Widow, Qualifying Widower,\nMarried Filing Separately, " +
                    "or Head of Household:");
            scannedFillingStatus = scanner.nextLine();
        }


        //Prompt user for 2009 income
        System.out.println("Please enter your 2009 income:");
        taxableIncome = scanner.nextInt();

        //Prompt user for 2009 income checks
        while (taxableIncome < 0) {

            System.out.print("Please re-enter your 2009 income:");
            taxableIncome = scanner.nextInt();
        }


        //Single filing case taxes
        if ("Single".equalsIgnoreCase(scannedFillingStatus)) {

            if (taxableIncome >= 0 && taxableIncome <= 8350) {

                System.out.print("Your income tax rate is 10%, and you'd need to pay $");
                System.out.printf("%.2f", taxableIncome * .1);

            } else if (taxableIncome >= 8351 && taxableIncome <= 33950) {

                System.out.print("Your income tax rate is 15%, and you need to pay $");
                System.out.printf("%.2f", taxableIncome * .15);

            } else if (taxableIncome >= 33951 && taxableIncome <= 82250) {

                System.out.print("Your income tax rate is 25%, and you need to pay $");
                System.out.printf("%.2f", taxableIncome * .25);

            } else if (taxableIncome >= 82251 && taxableIncome <= 171550) {

                System.out.print("Your income tax rate is 28%, and you need to pay $");
                System.out.printf("%.2f", taxableIncome * .28);

            } else if (taxableIncome >= 171551 && taxableIncome <= 372950) {

                System.out.print("Your income tax rate is 33%, and you need to pay $");
                System.out.printf("%.2f", taxableIncome * .33);

            } else if (taxableIncome >= 372951) {

                System.out.print("Your income tax rate is 35%, and you need to pay $");
                System.out.printf("%.2f", taxableIncome * .35);
            }
        }


        //Married filing jointly and qualifying widow(er) case taxes
        if ("Married Filing Jointly".equalsIgnoreCase(scannedFillingStatus) ||
                "Qualifying Widow".equalsIgnoreCase(scannedFillingStatus) ||
                "Qualifying Widower".equalsIgnoreCase(scannedFillingStatus)) {

            if (taxableIncome >= 0 && taxableIncome <= 16700) {

                System.out.print("Your income tax rate is 10%, and you need to pay $");
                System.out.printf("%.2f", taxableIncome * .1);

            } else if (taxableIncome >= 16701 && taxableIncome <= 67900) {

                System.out.print("Your income tax rate is 15%, and you need to pay $");
                System.out.printf("%.2f", taxableIncome * .15);

            } else if (taxableIncome >= 67901 && taxableIncome <= 137050) {

                System.out.print("Your income tax rate is 25%, and you need to pay $");
                System.out.printf("%.2f", taxableIncome * .25);

            } else if (taxableIncome >= 137051 && taxableIncome <= 208850) {

                System.out.print("Your income tax rate is 28%, and you need to pay $");
                System.out.printf("%.2f", taxableIncome * .28);

            } else if (taxableIncome >= 208851 && taxableIncome <= 372950) {

                System.out.print("Your income tax rate is 33%, and you need to pay $");
                System.out.printf("%.2f", taxableIncome * .33);

            } else if (taxableIncome >= 372951) {

                System.out.print("Your income tax rate is 35%, and you need to pay $");
                System.out.printf("%.2f", taxableIncome * .35);
            }
        }


        //Married filing separately case taxes
        if ("Married Filing Separately".equalsIgnoreCase(scannedFillingStatus)) {

            if (taxableIncome >= 0 && taxableIncome <= 8350) {

                System.out.print("Your tax rate is 10%, and you need to pay $");
                System.out.printf("%.2f", taxableIncome * .1);

            } else if (taxableIncome >= 8351 && taxableIncome <= 33950) {

                System.out.print("Your tax rate is 15%, and you need to pay $");
                System.out.printf("%.2f", taxableIncome * .15);

            } else if (taxableIncome >= 33951 && taxableIncome <= 68525) {

                System.out.print("Your tax rate is 25%, and you need to pay $");
                System.out.printf("%.2f", taxableIncome * .25);

            } else if (taxableIncome >= 68526 && taxableIncome <= 104425) {

                System.out.print("Your tax rate is 28%, and you need to pay $");
                System.out.printf("%.2f", taxableIncome * .28);

            } else if (taxableIncome >= 104426 && taxableIncome <= 186475) {

                System.out.print("Your tax rate is 33%, and you need to pay $");
                System.out.printf("%.2f", taxableIncome * .33);

            } else if (taxableIncome >= 186476) {

                System.out.print("Your tax rate is 35%, and you need to pay $");
                System.out.printf("%.2f", taxableIncome * .35);
            }
        }


        //Head of household case taxes
        if ("Head of Household".equalsIgnoreCase(scannedFillingStatus)) {

            if (taxableIncome >= 0 && taxableIncome <= 11950) {

                System.out.print("Your tax rate is 10%, and you need to pay $");
                System.out.printf("%.2f", taxableIncome * .1);

            } else if (taxableIncome >= 11951 && taxableIncome <= 45500) {

                System.out.print("Your tax rate is 15%, and you need to pay $");
                System.out.printf("%.2f", taxableIncome * .15);

            } else if (taxableIncome >= 45501 && taxableIncome <= 117450) {

                System.out.print("Your tax rate is 25%, and you need to pay $");
                System.out.printf("%.2f", taxableIncome * .25);

            } else if (taxableIncome >= 117451 && taxableIncome <= 190200) {

                System.out.print("Your tax rate is 28%, and you need to pay $");
                System.out.printf("%.2f", taxableIncome * .28);

            } else if (taxableIncome >= 190201 && taxableIncome <= 372950) {

                System.out.print("Your tax rate is 33%, and you need to pay $");
                System.out.printf("%.2f", taxableIncome * .33);

            } else if (taxableIncome >= 372951) {

                System.out.print("Your tax rate is 35%, and you need to pay $");
                System.out.printf("%.2f", taxableIncome * .35);
            }
        }
    }
}