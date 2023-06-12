package AdvancedCoding;

public class Testtingggg {
    private String[] Employee = new String[100];
    private String name;
    private int age;
    private String position;
    private int countOfEmployees;

    public Testtingggg(){
    }

    public void setEmploye(String name, int age, String position){
        this.name=name;
        this.age=age;
        this.position=position;
        Employee[countOfEmployees] = name;
        countOfEmployees++;
    }
    public String getNameofEmploye(){
        return name;
    }

    public int getCount () {
        return countOfEmployees;
    }

}
