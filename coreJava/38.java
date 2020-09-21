// 38.	Create a class Employee with three data members (empNo, salary and totalSalary) and 
// following features.
// a.	Only parameterized constructor. [Do not overload the constructor]
// b.	totalSalary always represents salary total of all the employees created.
// c.	empNo should be auto incremented.
// d.	display total employees and totalSalary using a method.
// Create another class EmployeeDemo (main class) that creates some Employee objects and calls 
// Employee method to display no. of employees and total of their salaries.

import java.util.Scanner;
class Employee{
    private static int empNo;
    private int salary;
    private static int totalSalary;
  

    Employee(int salary){
        empNo = ++empNo;
        this.salary = salary; 
        totalSalary = totalSalary + salary;       
    }

    

    static void show (){
        System.out.println("total employees = "+empNo);
        System.out.println("total salary = "+totalSalary);
    }
}

class EmployeeDemo{
    public static void main(String args[]){
        // Employee e = new Employee(1000);
        // Employee e1 = new Employee(1000);
        // Employee e2 = new Employee(1000);
        // Employee e3 = new Employee(1000);

        Scanner sc = new Scanner(System.in);
        System.out.println("enter how many objects you want to create : ");
        int no = sc.nextInt();
        for(int i=0;i<no;i++)
        {
            System.out.println("enter salary : ");
            int sal = sc.nextInt();
            Employee e = new Employee(sal);
        }

        Employee.show();

    }
}