// 13.	Program to find greatest in 3 numbers.
//  [ once using if else statement and then using ternary operator ( logical operator) ]  

import java.util.Scanner;

class GreatestNo{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter three no ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();


        System.out.println("**********************with ternary operator ******************");
         int s = (n1 > n2) ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
         {
             System.out.println(s+" is the greatest number ");
         }

        System.out.println("**********************with if-else ******************");
        if(n1 > n2 && n1>n3)
        {
        System.out.println(n1+" is the greatest number ");
        }
        else if(n2 > n3 && n2>n1)
        {
        System.out.println(n2+" is the greatest number ");
        }
        else
        System.out.println(n3+" is the greatest number ");      
    }
}