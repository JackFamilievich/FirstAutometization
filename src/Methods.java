import javax.xml.crypto.Data;
import java.util.Arrays;
import java.util.Date;

public class Methods {
    public static void main (String[]args){

        /*Data*/
        Date todaysDate = new Date();
        todaysDate.getTime(); /* взагалі не потрібно*/
        System.out.println(todaysDate);


        /*String Methods*/
        String messageExample = new String("hello world");
        String message = "   hello world" + "!!";
        message.length();
        message.endsWith("!!"); /* boolean*/
        message.startsWith("!!");
        message.indexOf("H");
        message.replace("!","*");
        message.toLowerCase();
        message.toUpperCase();
        message.trim();
        message.equals("hello"); // comparing operator for Strings
        System.out.println(message.trim());

        /*Arrays*/
        /*OLD WAY*/
        /*single list*/
        int [] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(Arrays.toString(numbers)); /*Array.toString() needs to be added all the time*/
        /*NEW WAY*/
        int [] numbersList = {1,14,3,4,5};
        System.out.println(Arrays.toString(numbersList));

        /*Method fields----------------------*/
        /*Sorting*/
        Arrays.sort(numbersList);
        System.out.println("to String: " + Arrays.toString(numbersList));

        /*OLD WAY*/
        /*multiple list*/
        int [] [] numbersTable = new int[2][3];
        numbersTable [0][0] = 1;
        System.out.println(Arrays.deepToString(numbersTable)); /*deepToString() for multiple list*/
        /*NEW WAY*/
        int [][] numbersTableNew = {{1,3,3},{4,2}};
        System.out.println(Arrays.deepToString(numbersTableNew));


        int[] myArray = {1, 2, 3, 4, 6};
        for (int i = 0; i < myArray.length; i++) {
          if (myArray[i] == 6) {
                System.out.println("here'ss: "+ myArray[i]);
            }
        }

        int[] myArray2 = {1, 2, 3, 4, 5};
        for (int element : myArray2) {
            System.out.println(element);
        }
    }
}


