// 03.	Find the result of following expressions. You need to determine the primitive data 
// type of the variable by looking carefully the given expression and initialize variables
//  by any random value.
// A. y = x2 + 3x - 7 (print value of y) 
// B. y = x++ + ++x (print value of x and y) 
// C. z = x++ - --y - --x  +  x++ (print value of x ,y and z)
// D. z = x && y || !(x || y)  (print value of z) [ x, y, z are boolean variables ]

import java.util.Scanner;
class DemoExpression{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of x ");
        int x=sc.nextInt();
        int y = (x * 2)+(3 * x)-7;
        System.out.println(y);

        int z = x++ + ++x;
        System.out.println(x+" " +z);

        int p = x++ - --y - --x  +  x++;
        System.out.println(x+" " +y+" "+p);


        System.out.println("enter the boolean value of x");
        boolean x1 = sc.nextBoolean();
        System.out.println("enter the boolean value of y");
        boolean y1 = sc.nextBoolean();
        boolean q = x1 && y1 || !(x1 || y1) ;
        System.out.println("x1 = "+x1+" y1 = " +y1+" q = "+q);
    }
}