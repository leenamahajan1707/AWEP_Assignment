// 41.	Write a program to demonstrate this() construct functionality
class Person{
    Person(){
        this(1);
        System.out.println("Person no-arg constructor");
        
    }
    Person(int i){
        System.out.println("Person param constructor");
    }
}
class Employee extends Person{
    

    Employee(){
          this(12);
        System.out.println("Employee no-arg constructor");
    }
    Employee(int i){
        // this();
        System.out.println("Employee param constructor" +i);
    }

}

class PersonDemo{
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter how many objects you want to create : ");
        // int no = sc.nextInt();
        Employee e = new Employee();
        // Employee e = new Employee(2);
    }
}