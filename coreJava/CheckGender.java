// 15.	Accept person’s gender (character m for male and f for female), age (integer), as input 
// and then check whether person is eligible for marriage or not

import java.util.Scanner;

class CheckGender{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter gender ");
        char c = sc.next().charAt(0);
        System.out.println("enter age ");
        int g = sc.nextInt();
        if((c == 'f' || c == 'F' ) && g >=18)
        {
        System.out.println(" female is eligible for marriage ");
        }
        else if((c == 'm' || c == 'M')  && g >=21)
        {
        System.out.println(" male is eligible for marriage ");
        }
        else{
        System.out.println(" person is not eligible for marriage ");
        }
    }
}
        
