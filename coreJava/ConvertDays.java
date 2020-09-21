// 09.	Write a program to read the days (eg. 670 days) as integer value using Scanner class.
//  Now convert the entered days into complete years, months and days and print them.

import java.util.Scanner;

class ConvertDays{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter days : ");
        int days = sc.nextInt();

        int year = days / 365 ;
        days = days % 365;
        int months = days / 30;
        days = days % 30 ;
        System.out.println(year+" Year "+months+" months "+days+" days");
    }    

}