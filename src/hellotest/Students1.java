package hellotest;

public class Students1 {
    Students1 (String studentName2, int MathScore2, int HistoryScore2) {
        studentName = studentName2;
        MathScore = MathScore2;
        HistoryScore = HistoryScore2;

    }
    String studentName;
    int MathScore;
    int HistoryScore;

}

class Methods {
    Students1 st = new Students1("Petya", 5, 5);
    int methodSum () {
        int summ = st.HistoryScore + st.MathScore;
        System.out.println("Summ: " + summ);
        return summ;
    }

    int methodAvarage () {
        int avagare = methodSum() / 2;
        System.out.println("avarage: " + avagare);
        return avagare;
    }
}

