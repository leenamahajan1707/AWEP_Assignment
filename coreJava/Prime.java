// 18.	Program to check whether number is prime or not.

import java.util.Scanner;
class Prime{
     public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter no ");
        int n1 = sc.nextInt();

        boolean flag=false;
        for(int i=2;i<=(n1/2);i++)
        {
            if(n1 % i == 0)
            {
                flag = true;
            }
        }

        if(flag == true)
        {
        System.out.println(n1+" is not prime no");
        }
        else
        {
        System.out.println(n1+" is prime no");
            
        }
    }
}