// 37.	Create a class Person with properties (name and age) with following features. 
// a.	Default age of person should be 18.
// b.	A person object can be initialized with name and age.
// c.	Method to display name and age of person
// Create another class PersonDemo ( main class ) that demonstrates the functionalities of 
// Person class by creating Person object and calling methods.

import java.util.Scanner;
class Person{
    private String name;
    private int age;

    Person(){
        age = 18;
    }
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    void show(){
        System.out.println("name = "+name);
        System.out.println("age = "+age);
    }
}

class PersonDemo{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name : ");
        String name = sc.next();
        System.out.println("enter age : ");
        int age = sc.nextInt();
        Person p =new Person();
        Person p1 =new Person(name,age);
        p.show();
        p1.show();

    }
}
