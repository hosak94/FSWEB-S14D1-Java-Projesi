package com.workintech.main;

import com.workintech.employee.*;
import com.workintech.model.Circle;
import com.workintech.model.Cuboid;
import com.workintech.model.Cylinder;
import com.workintech.model.Rectangle;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------Circle--------------");
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55,7.25);
        System.out.println("------------Cylinder--------------");
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());
        System.out.println("------------Rectangle--------------");
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        System.out.println("------------Cuboid--------------");
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());
        System.out.println("------------Employee--------------");
        Employee employee = new Employee(1,"Ahmet", 10000);
        HRManager hrManager = new HRManager(2,"Asım", 30000);
        JuniorDeveloper juniorDeveloper1 = new JuniorDeveloper(3,"Ali",11000);
        JuniorDeveloper juniorDeveloper2 = new JuniorDeveloper(4,"Veli", 11500);
        MidDeveloper midDeveloper1 = new MidDeveloper(5,"Deniz",15000);
        MidDeveloper midDeveloper2 = new MidDeveloper(6,"Aslı", 15250);
        SeniorDeveloper seniorDeveloper1 = new SeniorDeveloper(7,"Barıs",20000);
        SeniorDeveloper seniorDeveloper2 = new SeniorDeveloper(8,"Dursun",21000);
        employee.work();
        hrManager.work();
        juniorDeveloper1.work();
        juniorDeveloper2.work();
        seniorDeveloper1.work();
        seniorDeveloper2.work();
        midDeveloper2.work();
        midDeveloper1.work();
        hrManager.addEmployee(seniorDeveloper1);
        hrManager.addEmployee(midDeveloper1);
        hrManager.addEmployee(juniorDeveloper1);
        hrManager.addEmployee(seniorDeveloper2);
        hrManager.addEmployee(midDeveloper2);
        hrManager.addEmployee(juniorDeveloper2);
        System.out.println("Developer Name: "+juniorDeveloper1.getName()+" "+ " Salary: "+juniorDeveloper1.getSalary());
        System.out.println("Developer Name: "+juniorDeveloper2.getName()+" "+ " Salary: "+juniorDeveloper2.getSalary());
        System.out.println("Developer Name: "+midDeveloper1.getName()+" "+ " Salary: "+midDeveloper1.getSalary());
        System.out.println("Developer Name: "+midDeveloper2.getName()+" "+ " Salary: "+midDeveloper2.getSalary());
        System.out.println("Developer Name: "+hrManager.getName()+" "+ " Salary: "+hrManager.getSalary());
    }
}