// 21.	Program to show sum and average of 10 element array. Accept array elements from user. 
import java.util.Scanner;
class ArraySumAndAvg{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        for(int i=0;i<a.length;i++)
        {
            System.out.println("enter element ");
            a[i] = sc.nextInt();
        }

        int sum = 0;
        for(int as : a )
        {
            sum = sum + as;
        }
            int avg =  sum / a.length;
        System.out.println("sum = "+sum);
        System.out.println("Avg = "+avg);

    }
}
        