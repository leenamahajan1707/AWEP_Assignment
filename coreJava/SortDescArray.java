// 22.	Sort a ten element array in descending order.
import java.util.Scanner;
class SortDescArray{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        for(int i=0;i<a.length;i++)
        {
            System.out.println("enter element ");
            a[i] = sc.nextInt();
        }
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.print(" "+a[i]);
            
        }

    }
}