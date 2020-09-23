// 47.	Create a program to demonstrate constructor chaining.

class Person{
    Person(){
        this("hii");
        System.out.println("person no arg");
    }
    Person(String s){
        System.out.println("person param "+s);
    }
}
class Employee extends Person{
    Employee(){
        this("hiii hello");
        System.out.println("Employee no arg");
    }
    Employee(String s){
        System.out.println("Employee param "+s);
    }

}
class Manager extends Employee{
    Manager(){
        System.out.println("Manager no arg");
    }
    Manager(String s){
         this();
        System.out.println("Manager param "+s);
    }

}
class ConstChaining{
    public static void main(String args[]){
        Manager m = new Manager("hello");
    }
}
