// 25.	Write the program to find the sum of even elements and sum of odd 
// elements present in the array of integer type

import java.util.Scanner;
class SumOfEvenOddEle{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        for(int i=0;i<a.length;i++)
        {
            System.out.println("enter element ");
            a[i] = sc.nextInt();
        }
        int sum =0;
        int sumodd =0;
        for(int i=0;i<a.length;)
        {
            sumodd = sumodd + a[i];
            
            i=i+2;
        }

        for(int i=1;i<a.length;)
        {
            sum = sum +a[i];
            i=i+2;
        }
        System.out.println("sum of even place = "+sum);
        System.out.println("sum of odd place = "+sumodd);

    }
}