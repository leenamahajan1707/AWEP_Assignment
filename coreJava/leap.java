import java.util.Scanner;
class leap{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter year ");
        int yr = sc.nextInt();

        if(yr % 4 == 0  && yr % 100 != 0 || yr % 400 == 0)
        {
        System.out.println(yr+" year is leap year ");
        }
        else
        System.out.println(yr+" year is normal year ");
    }
}
