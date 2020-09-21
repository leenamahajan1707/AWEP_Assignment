// 17.	Write a program to reverse a given number.
import java.util.Scanner;
class ReverseNo{
     public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter no ");
        int n1 = sc.nextInt();
        int rev = 0;
        while(n1>0)
        {
            
        int n = n1 % 10;
         rev = rev*10 + n;
        n1=n1/10;
        }
    
        System.out.println("rev no :"+rev);
        
    }
}