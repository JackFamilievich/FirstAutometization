package hellotest.Lesson7;

public class AbstractTest {
    public static void main (String[]args){
        Employee1 emp1 = new Teacher();
        Employee1 emp2 = new Driver();
        Employee1 emp3 = new Doctor();
        Employee1 [] array = {emp1,emp2, emp3};
        for (Employee1 hello:array) {hello.work();}
    }

}

abstract class Employee1 {
    void sleep() {System.out.println("Employee sleeps");}
    abstract void work();
}
class Teacher extends Employee1 {
    void work() {
        System.out.println("Teacher works");
    }
}
class Driver extends Employee1 {
        void work(){
            System.out.println("Driver works");
        }
}
class Doctor extends Employee1 {
    void work() {
        System.out.println("Doctor works");
    }
}






