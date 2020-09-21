// 10.	Write a program to convert temperature from Fahrenheit to Celsius. 
// Take Fahrenheit as input using Scanner class. [ formula : C= 5*(f-32)/9 ]

import java.util.Scanner;

class temperature{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter temperatur in fahrenheit");
        double f = sc.nextDouble();

        double c = 5*(f-32)/9 ;
        System.out.println("temperatur in celcius "+c);

    }
}