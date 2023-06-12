package AdvancedCoding;

import javax.sound.midi.Soundbank;

public class Student {
    int age;
    int weight;
    String name;
    String surname;

    public Student(int age, int weight, String name, String surname) {
        this.age = age;
        this.weight = weight;
        this.name = name;
        this.surname = surname;
    }

    public void setAge(int a) {
    }

    public void setName(String n) {
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;

    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    static class Students1 {
        int age;
        int weight;
        String name;
        String surname;

        public Students1() {
        }

        public void setAge(int a) {
            age = a;
        }

        public void setName(String n) {
            name = n;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;

        }
    }
}


