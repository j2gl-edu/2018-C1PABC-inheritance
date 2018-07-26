package edu.advanced.inheritance;

import java.util.Date;

public class TemporalEmployee extends Employee {

    Date startDate;
    Date endDate;

    public TemporalEmployee(String nombre, int age, String id, double salary, Date startDate, Date endDate) {
        super(nombre, age, id, salary);
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Start Date: " + startDate.toString());
        System.out.println("End Date  : " + startDate.toString());
    }

}