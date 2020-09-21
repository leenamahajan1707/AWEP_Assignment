// 16.	Write a program to print table of any entered number using loop.
import java.util.Scanner;

class table{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter no ");
        int n1 = sc.nextInt();
        for (int i=1;i<=10;i++)
        {
            int no = n1 * i;
        System.out.print(" "+no);
        }
    }
    }