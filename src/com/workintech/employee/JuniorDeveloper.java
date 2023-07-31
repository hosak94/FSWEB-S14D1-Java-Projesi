package com.workintech.employee;

public class JuniorDeveloper extends Employee {

    public JuniorDeveloper(int id,String name, double salary) {
        super(id,name,salary);
    }
    @Override
    public void work() {
        System.out.println("Junior Developer " +getName()+ " starts to working");
        setSalary(getSalary() + 1000);
    }
}
