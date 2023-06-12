package AdvancedCoding;

import java.util.ArrayList;

public class Wheel {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 6};

        for (int i = 0; i < myArray.length; i++) {
            {
                System.out.println("here'ss: "+ myArray[i]);
            }
        }
        int[] myArray2 = {1, 2, 3, 4, 5};

        for (int element : myArray2) {
            System.out.println(element);
        }
    }
}

