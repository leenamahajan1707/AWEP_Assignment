// 46.	Create a program to demonstrate the use of instanceof operator or secure reference down casting.
import java.util.Scanner;
class Faculty{
    private int facultyId;
    protected int salary;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter facultyId : ");
        facultyId = sc.nextInt();
    }

    void printSalary(){
        System.out.println("Faculty id = "+facultyId+" salary = "+salary);
    }
}
class FullTimeFaculty extends Faculty{
    private int basicSalary;
    private int allowance;

    void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter basicSalary : ");
        basicSalary = sc.nextInt();
        System.out.println("enter allowance : ");
        allowance = sc.nextInt();
    }

    void calculatedSalary(){
        
        salary = basicSalary + allowance;
    }

}

class SalaryDemo{
    public static void main(String arg[])
    {
        
        Faculty fac[] = {new FullTimeFaculty(),new Faculty()};

        for(Faculty a : fac)
        {
         if(a instanceof FullTimeFaculty)  
         {
             FullTimeFaculty f = (FullTimeFaculty) a;
            f.input();
            f.calculatedSalary();
            f.printSalary();
         }
        }
    }
}