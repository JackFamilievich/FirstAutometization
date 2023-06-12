package hellotest;

public class testMethodinMethod {
    int Summ (int a, int b, int c) {
    int result = a+b+c;
        return result;


    }

    int MiddleScore (int a1, int b1, int c1) {
        int result2 = Summ(a1,b1,c1) / 3;
        return result2;
    }
}

class Students233 {
    public static void main (String[]args) {
    testMethodinMethod student00 = new testMethodinMethod();
    int hello = student00.Summ(1,2, 4);
    int hi = student00.MiddleScore(6,6,6);
    testMethodinMethod student01 = new testMethodinMethod();
        System.out.println("Result: " + hello + " middle result: " + hi);


    }
}
