// 27.	Write a program to fine the smallest and greatest number present in the array of integer type.
import java.util.Scanner;
class SmallestAndGretestArrayEle{
    public static void main(String args[])
    {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {
            System.out.println("enter element : ");
            a[i] = sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=1;j<a.length;j++)
            {
                if(a[i] > a[j] )
                {
                    int temp;
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }           
            
        }

        for(int i =0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }


    }
}