// 44.	Create three classes
// -	Faculty with two data members facultyId and salary and two methods, one intput() method 
//     for accepting facultyId as input and another printSalary() to print salary.
// -	FullTimeFaculty that inherits class Faculty with two data members’ basicSalary and allowance.
//     Override input() method in this class that calls super class inut() method and accepts
//     basicSalary and allowance as input. Salary should not be accepted as input but should be 
//     calculated using formula (basicSalary + allowance)
// -	PartTimeFaculty that inherits class Faculty with two data members’ workingHours, ratePerHour.
//     Override input() method in this class that calls super class inut() method and accepts 
//     workingHours and ratePerHour as input. Salary should not be accepted as input but should be 
//     calculated using formula ( workingHour * ratePerHour )

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
class PartTimeFaculty extends Faculty{
    int workingHours;
    int ratePerHour;;
    void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter workingHour : ");
        workingHours = sc.nextInt();
        System.out.println("enter ratePerHour : ");
        ratePerHour = sc.nextInt();
    }
    void calculatedSalary(){
        salary = workingHours * ratePerHour;
    }
}

class SalaryDemo{
    public static void main(String arg[])
    {
        PartTimeFaculty p = new PartTimeFaculty();    
        p.input();
         p.calculatedSalary();
        p.printSalary();

        FullTimeFaculty f = new FullTimeFaculty();    
        f.input();
        f.calculatedSalary();
        f.printSalary();
    }
}