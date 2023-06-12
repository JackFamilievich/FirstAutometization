package AdvancedCoding;

public class MultipleArrays {
    public static void main (String[]args){
        int [][] intArray = {{0,3},{4,5},{8,9}};
        for(int i=0; i< intArray.length;i++ ){
            for (int j=0; j<intArray[i].length;j++)
            System.out.println(intArray[i][j]);
        }

        int [] intSingleArray = new int [2];
        intSingleArray [0] = 2;
        System.out.println(intSingleArray);
        System.out.println(intSingleArray[0]);
        System.out.println("brake");
        for (int i = 0; i<intSingleArray.length;i++) {
            System.out.println(intSingleArray[i]);
        }
    }

}
