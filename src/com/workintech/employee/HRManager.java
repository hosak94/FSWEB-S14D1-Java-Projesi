package com.workintech.employee;

public class HRManager extends Employee{
    private Employee[] juniorDevelopers;
    private Employee[] midDevelopers;
    private Employee[] seniorDevelopers;

    public HRManager(int id, String name,double salary) {
        super(id,name,salary);
        juniorDevelopers = new Employee[10];
        midDevelopers = new Employee[10];
        seniorDevelopers = new Employee[10];
    }

    public void addEmployee(JuniorDeveloper juniorDeveloper) {
        addEmployee(juniorDeveloper, juniorDevelopers);
    }

    public void addEmployee(MidDeveloper midDeveloper) {
        addEmployee(midDeveloper, midDevelopers);
    }

    public void addEmployee(SeniorDeveloper seniorDeveloper) {
        addEmployee(seniorDeveloper, seniorDevelopers);
    }
    private int findEmptyIndex (Employee[] employees) {
        for(int i = 0; i < employees.length; i++) {
            if(employees[i] == null) {
                return i;
            }
        }
        return -1;
    }
  private void addEmployee(Employee employee, Employee[] employees) {
        int index = findEmptyIndex(employees);
        if(index == -1) {
            System.out.println("Array is full. Cannot add!");
            return;
        }
        employees[index] = employee;
        System.out.println("Employee added successfully");
  }




    @Override
    public void work() {
        System.out.println("HRManager "+getName()+ " starts to working");
        setSalary(getSalary() + 3000);
    }

}
