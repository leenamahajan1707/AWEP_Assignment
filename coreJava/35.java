// 35.	Create a class MathOperation that has four static methods. add() method that takes
// two integer numbers as parameter and returns the sum of the numbers. subtract() method 
// that takes two integer numbers as parameter and returns the difference of the numbers. 
// multiply() method that takes two integer numbers as parameter and returns the product. 
// power() method that takes two integer numbers as parameter and returns the power of first
// number to second number. Create another class Demo (main class) that takes the two numbers 
// from the user and calls all four methods of MathOperation class by providing entered numbers
// and prints the return values of every method.
import java.util.Scanner;
class MathOperation{
    static int add(int a, int b){
        return(a + b);
    }

    static int subtract(int a,int b){
        return(a - b);
    }
    static int multiply(int a,int b){
        return(a * b);
    }
    static double power(int number,int p){
        return(Math.pow(number, p));
    }
}

class Demo{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st value : ");
        int a = sc.nextInt();
        System.out.println("enter 2nd value : ");
        int b = sc.nextInt();

        // MathOperation m = new MathOperation();
       int add = MathOperation.add(a,b);
       int sub = MathOperation.subtract(a,b);
       int mul = MathOperation.multiply(a,b);
        double pow = MathOperation.power(a,b);

        System.out.println("addition "+add);
        System.out.println("substraction "+sub);
        System.out.println("multiplication "+mul);
        System.out.println("power "+pow);
    }
}