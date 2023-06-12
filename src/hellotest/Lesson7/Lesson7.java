package hellotest.Lesson7;
public class Lesson7 {

    int x;
    static double i;

    public void guys() {
        i++;
        System.out.println("ffs");
    }
        public static void guysGirls() {
        i++;
        }


    public static void main (String args[]) {
        int a = 10;
        a = 10+2;
        final int b = 10;
        int hello23 = a+b;
        System.out.println(hello23);
        Lesson55 TC = new Lesson55();
        TC.HelloCount(1,2);
        hellotest.Lesson7.Lesson55.yesOrNo();
    }
}

class Lesson55 {
    int HelloCount(int a, int b) {
        int result = a + b;
        if (result > 10) {
            System.out.println("hello");
        }
        if (result < 10 ) {
            System.out.println("no");
        }
        return result;
    }
    static void yesOrNo() {
        System.out.println("hello my friend");
    }
}
