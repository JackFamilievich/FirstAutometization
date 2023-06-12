package hellotest;
//
public class Students {
    String studentName;
    int MathScore;
    int HistoryScore;
    int LanguageScore;


}

class StudentMethods {
    int scoreSum(Students st) {
        int scoreSum = (st.HistoryScore + st.LanguageScore + st.MathScore) ;
        System.out.println("Name: " + st.studentName + " ScoreSum: " + scoreSum);
        return scoreSum;
    }

    int avegareSum (Students ts) {
        int average = scoreSum(ts) / 3;
        System.out.println("Name: " + ts.studentName + " AvarageSum: " + average);
        return average;
    }


    }

class StudentTest {
    public static void main (String []args) {
        Students student1 = new Students();
        student1.studentName = "Methy";
        student1.MathScore = 5;
        student1.LanguageScore = 5;
        student1.HistoryScore = 4;
        Students student2 = new Students();
        student2.studentName = "Jack";
        student2.MathScore = 4;
        student2.LanguageScore = 5;
        student2.HistoryScore = 2;
        StudentMethods methods = new StudentMethods();
        methods.scoreSum(student1);
        methods.scoreSum(student2);
        methods.avegareSum(student1);




    }
}