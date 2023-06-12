package Lesson5Homework;

public class Employee {
    String Name;
    String Position;
    int Salary;
    Employee (String Name2, String Position2, int Salary2) {
        Salary = Salary2;
        Name = Name2;
        Position = Position2;
    }

    int salaryIncrease (int salaryIncrease) {
        Salary += salaryIncrease;
        return salaryIncrease;
    }
}

class EmployeeTest {
    public static void main (String[]args) {
        Employee ts = new Employee("Jason","HR", 200);
        ts.salaryIncrease(900);
        System.out.println(ts.Name + ts.Position + ts.Salary);

    }
}