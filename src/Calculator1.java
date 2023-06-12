import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        final byte MONTH_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principal = 0;
        float monthInterestRate = 0;
        int numberOfPayments = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Principal: ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a value between 1000 and 1_000_000");
        }

        while (true) {
            System.out.print("Annual Interest Rate %: ");
            float enterAnnualInterestRate = scanner.nextFloat();
            if (enterAnnualInterestRate >= 1 && enterAnnualInterestRate <= 30)
            {
                monthInterestRate = enterAnnualInterestRate / PERCENT / MONTH_IN_YEAR;
                break;
            }
            System.out.println("Enter a value greater then 0 and less or equal to 30");
        }
        while (true) {
            System.out.print("Enter Period (of Years): ");
            byte enterNumberOfPayments = (byte) scanner.nextDouble();
            if (enterNumberOfPayments >= 1 && enterNumberOfPayments <= 30)
            {
                numberOfPayments = enterNumberOfPayments * MONTH_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }
        double mortgage = (principal * (monthInterestRate*(Math.pow(1+monthInterestRate,numberOfPayments))) / ((Math.pow(1+monthInterestRate,numberOfPayments))-1));
        String mortageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Mortgage: " + mortageFormatted);










    }
}