package AdvancedCoding;

public class Course {
    private String course_name;
    private String [] student_name = new String[100];
    private int student_count;
    public Course(String course_name) {
        this.course_name = course_name;
    }
    public void addStudent(String student){
    student_name[student_count]=student;
    student_count++;
    }
    public int getStudent_count(){
        return student_count;
    }
    public String getCourse_name(){
        return course_name;
    }
    public String[]getStudent_name(){
        return student_name;
    }

}
