// 24.	Write a program to search an element in the array.

import java.util.Scanner;
class SearchEle{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        for(int i=0;i<a.length;i++)
        {
            System.out.println("enter String element ");
            a[i] = sc.nextInt();
        }

        for(int i=0;i<a.length;i++)
        {
            System.out.print(" "+a[i]);
            
        }

        System.out.println("enter searching element : ");
        int s = sc.nextInt();

        boolean flag = false;
        for(int i=0; i<a.length ; i++){
            if(s == a[i])
                flag = true;
               
        }

        if(flag == true)
            {
                System.out.println("entered element is present ");
            }
            else{
                System.out.println("entered element is not present ");
            }
    }
}