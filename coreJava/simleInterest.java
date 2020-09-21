// 08.	Write a program to find the simple interest. 
// Take the principle amount, rate of interest and time from user using Scanner class.

import java.util.Scanner;

class simleInterest{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter principle amount");
        double p = sc.nextDouble();
        System.out.println("enter rate");
        double r= sc.nextDouble();
        System.out.println("enter time");
        double t= sc.nextDouble();

        double interest = (p * r * t)/100;
        System.out.println("Simple Interest = "+interest);
    }
}