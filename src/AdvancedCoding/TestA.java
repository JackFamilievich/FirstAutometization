package AdvancedCoding;

public class TestA {
    public static void main(String[] args) {
        Student student1 = new Student(16, 89, "Jack", "F");
        Student student2 = new Student(15, 89, "Hello", "Yeah");
        student1.display();
        student2.display();
        Student.Students1 studentt1 = new Student.Students1();
        studentt1.setAge(10);
        studentt1.setName("Vanya");
        studentt1.getAge();
        studentt1.getName();
        System.out.println("Name: " + studentt1.getName() + " Age: " + studentt1.getAge());
    }
}
