package edu.advanced.inheritance;

public class Employee {

    protected String name;
    protected int age;
    protected String id;
    protected double salary;

    public Employee() {
        super();
        System.out.print("Test");
    }

    public Employee(String name, int age, String id, double salary) {
        System.out.println("Employee constructor");
        this.name = name;
        this.age = age;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void display() {
        System.out.println("Name      : " + name);
        System.out.println("Age       : " + age);
        System.out.println("id        : " + id);
        System.out.println("Salary    : " + salary);
    }

}