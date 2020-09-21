// 06.	Write a program that takes radius of a circle as input. Read the entered radius
//  using Scanner class. Then calculate and print the area and circumference of the circle.

import java.util.Scanner;
class CircleRadius{
    public static void main(String args[]){
        final double pi = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius of circle : ");
        int r = sc.nextInt();

        double circumference = 2 * pi * r;
        double area = pi * r * r;

        System.out.println("circumference "+circumference+"  area :"+area); 
     }
}