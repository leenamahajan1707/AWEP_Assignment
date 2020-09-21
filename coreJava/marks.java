// 07.	Write a program to calculate sum of 5 subject’s marks & find percentage. 
// Take the obtained marks from user using Scanner class.
//  Output should be in this format [ percentage marks = 99 % ]. Use concatenation operator here


import java.util.Scanner;
class marks{
    public static void main(String args[]){
        final double pi = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter sub 1 marks : ");
        int s1 = sc.nextInt();
        System.out.println("enter sub 2 marks : ");
        int s2 = sc.nextInt();
        System.out.println("enter sub 3 marks : ");
        int s3 = sc.nextInt();
        System.out.println("enter sub 4 marks : ");
        int s4 = sc.nextInt();
        System.out.println("enter sub 5 marks : ");
        int s5 = sc.nextInt();

        double sum = s1 + s2 + s3 + s4 + s5 ;
        double percentage = (sum / 500) * 100  ; 

        System.out.println("sum "+sum+"  percentage marks = "+percentage+" %"); 
        
     }
}