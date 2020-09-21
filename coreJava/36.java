// 36.	Create a class MathOperation containing overloaded methods ‘multiply’ to calculate 
// multiplication of following arguments. 
// a.	 two integers 
// b.	 three floats 
// c.	 all elements of array 
// d.	one double and one integer 

class MathOperation{
    int multiply(int a, int b)
    {
        return(a * b);
    }
    float multiply(float a,float b,float c)
    {
        return(a * b * c);
    }
    int multiply(int a[])
    {
        int mul=1;
        for(int i=0;i<a.length;i++){
            mul = mul * a[i];
        }
        return mul;
    }
    double multiply(double a, int b)
    {
        return (a * b);
    }
}

class Demo{
    public static void main(String arg[])
    {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter 1st value : ");
        // int a = sc.nextInt();

        MathOperation m = new MathOperation();
        int one = m.multiply(2,3) ;
        float two = m.multiply(2.0f,3.0f,4.0f); 
        int a[]=new int[]{2,2,2,2};
         int three = m.multiply(a); 
        double four = m.multiply(2.5,2); 

        System.out.println("1st = "+one);
        System.out.println("2nd = "+two);
        System.out.println("3rd = "+three);
        System.out.println("4th = "+four);


    }
}
