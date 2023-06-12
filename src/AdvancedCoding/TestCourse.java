package AdvancedCoding;

public class TestCourse {
    public static void main  (String[]args) {
        Course Math = new Course("Math");
        Math.addStudent("Max");
        Math.addStudent("Nick");
        Math.addStudent("Luce");

        Course History = new Course("History");
        History.addStudent("Max-x");
        History.addStudent("Anton");
        System.out.println(Math.getCourse_name());
        for (int i = 0; i <Math.getStudent_count(); i++)
            System.out.println(Math.getStudent_name()[i]);

        System.out.println(History.getCourse_name());
        for (int i = 0; i <History.getStudent_count(); i++)
            System.out.println(History.getStudent_name()[i]);

    }
}
