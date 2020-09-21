// 11.	Write a program to swap two numbers without using third variable.

import java.util.Scanner;

class SwapNo{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter two no ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        n1 = n1 + n2;           //a =1+2 =3  b=a-b = 3-2=1
        n2 = n1 - n2;
        n1 = n1 - n2;
        System.out.println(n1+" "+n2);
    }
}
