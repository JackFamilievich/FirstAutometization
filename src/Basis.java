import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.awt.*;
import java.text.NumberFormat;
import java.util.Scanner;

public class Basis {
    public static void main (String[]args) {
        /*Basics*/
        byte age = 30;
        long viewsCounts = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = true;
        System.out.println(age);

        final float PI = 3.14F; /* CONSTANCE SHOULD BE IN CAPITAL LATTERs*/
        System.out.println(PI);

        //SHIFT + F (renaming)


        /*How reference works*/
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;
        byte x = 1;
        byte y = x;
        x = 3;
        System.out.println(y);
        System.out.println(point2);


        /*Math*/
        /*casting*/
        double result = (double)10/(double)3;
        System.out.println(result);


        /*Assignment operator*/
        int z = 1;
        int zz = z++; /* z++ -- z is copied to zz and then added ++ */
        /* if ++z - z is added ++ and then copied to zz */
        System.out.println(z);
        System.out.println(zz); /* that's why here z = 2 and zz = 1 ,because z++ ,first is value is copied '1' to zz
        and only then the math is done to z, so z is 2 */
        int a = 1;
        a = a + 2; /* equals 3 */
        /* 'a += 2' --  same as expression above */
        System.out.println(a);


        /*Implicit casting */
        // byte > short > int > long > float > double
        short c = 1;
        int d = c + 2;
        System.out.println();

        /*Explicit casting*/
        // vise-verse, to cast down, should be set type in the ()
        double f = 1.1;
        int g = (int)f +2;
        System.out.println(g);

        /* Casting Strings -- Parsing */
        String j = "1";
        // same - Short.parseShort(), Float, Double and so on // this is for example
        int jj = Integer.parseInt(j) + 2 ;
        System.out.println(jj);
        // double
        String l = "1.1";
        double  ll = Double.parseDouble(l) + 1;
        System.out.println(ll);


        /* Math Class */
        int result1 = Math.round(1.1F); // round values to lower number -- 1.1 = 1
        System.out.println(result1);
        //*Other Methods:
        // Math.ceil -- round to higher number 1.1 = 2 -- (int)Math.ceil(1.1F)
        // Math.floor -- have no idea -- 1.1 = 1
        // Math.max -- shows greater number (1,2) -- would be shown 2
        // Math.random -- random number under 1 -- 0.932304423432 */
        double roundRandomValue = Math.round(Math.random()*100);
        System.out.println(roundRandomValue);//Random number is rounder
        //Now let's use explicit casting to remove the '0'
        int roundRandomValue1 = (int)Math.round(Math.random()*100); // or '(int) (Math.round()*100);' can be used
        System.out.println(roundRandomValue1);


        /* Formatting */
        // Abstract class - cannot be used 'new NumberFormat' for abstract Classes
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        //then currency object has methods --
        String result2 = currency.format(12354.884);
        System.out.println(result2);
        // for % is used Number.Format.getPercentInstance();
        // for channing the methods -- NumberFormat.getPercentInstance().format();
        /* so the correct form of the expression would be
        String result2 = NumberFormat.getPercentInstance().format();
         */

        /* ---- Math operators ---- */
        // % -- it's a modules operator -- returns remainder of the division

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        short number = scanner.nextShort();
        if (number % 5 == 0) {                // true
            if (number % 3 == 0)              // false = Fizz
                System.out.println("FizBuzz");
            else
                System.out.println("Fizz");
        } else if (number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);

        /* Another example:
        if (number % 5 == 0 && number % 3 == 0)
            System.out.println("FizzBuzz");
        else if (number % 5 == 0)
            System.out.println("Fizz");
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);
         */

        /* Comparison Operators */
        int v = 1;
        int b = 1;
        System.out.println(v==b); // == equal boolean operator
        // v!=b is false state operator -- v is not equal b and the answer is 'false' because they are equal
        // More operators: x<=y; - x less or equal to y;  x<y; - x less then y;

        /* Logical Operators */
        int temperature = 22;
        boolean isWarm  = temperature > 20 && temperature < 30; // 'and' operator
        // more than 20 and less than 30 - true (BOTH CONDITIONS MUST BE TRUE)

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligibleNow = hasHighIncome || hasGoodCredit; // 'or' operator
        // if either of the conditions is true -- 'true'
        boolean isEligibleRecord3 = hasHighIncome || hasCriminalRecord && hasCriminalRecord; // '!' not operator
        // reverse the expression to pass the conditions;
        // the person hasCriminalRecords =false , and we need to see if the person passes. If we use expression without '!' then the answer will be false, although the person has no criminal records, therefore we reverse the condition.


        /* IF Statement */
        byte temp = 32;
        if (temp > 30) {
            System.out.println("It's a hot day");
        }
        else if (temp > 20 && temp <= 30) {
            System.out.println("hello world it's a good weather outside");
        }
        else {
            System.out.println("ah never mind, it's a bit cold");
        }


        /* Ternary Operators */
        int income = 120_00;
        String className = (income < 100_00 ? "First" : "Economy");
        System.out.println(className);

        /* Switch statements */
        String role = "Guest";
        switch (role) {
            case "admin":
                System.out.println("You're the admin");
                break;
            case "user":
                System.out.println("You're the user");
                break;
            case "logged out":
                System.out.println("You has been logged out");
                break;
            default:
                System.out.println("You're guest");
        }



        /* for LOOPS */

        for (int i = 0; i < 5; i++) {
            System.out.println("hello world");
        }
        /* for (int i = 1; i <= 5; i++) {
            System.out.println("hello world");
        }*/

        /* While LOOPS*/
        String input = "";
        while (!input.equals("quit")) {       // white (true) {... } + break -- is used always with the break statement
            // comparing operator for Strings
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            if (!input.equals("quit"))
                System.out.println(input);
        } // or do loops
        do {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));
            System.out.println(input);

        /* While LOOP with BREAK statement

        while (!input.equals("quit")) {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("quit"))
            break;
                System.out.println(input);
         */

        /* while (!input.equals("quit")) {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("pass")
            continue;  -- the program starts again from the top
            if (input.equals("quit"));
            break;
         */

        /* FOR EACH LOOP */

        String [] fruits = {"Apple", "Mango", "Orange"};
        for (int m = 0; m < fruits.length; m++)
        System.out.println(fruits[m]);

        for (String fruit : fruits)
            System.out.println(fruit);






    }
}
