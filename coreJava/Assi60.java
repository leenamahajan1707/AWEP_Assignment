//60.	Create Interface StudentFee and declare following method.  getFee() throws InvalidFeeException. 
//This method ask fees from user and throws exception if user enters invalid or negative fees 
//Create class Student with members (name, fees) and implement the StudentFee Interface.
package Assignment;

import java.util.Scanner;

public class Assi60 {

	public static void main(String[] args) {
	Student s = new Student();
	Scanner sc = new Scanner(System.in);
	String name = sc.next();
	int fees = sc.nextInt();
	try {
		s.getFee(name,fees);
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}

interface StudentFee{
	void  getFee(String name, int fees) throws Exception;
}

class Student implements StudentFee{

	String name;
	int fees;
	@Override
	public void getFee(String name, int fees) throws Exception {
		if(fees < 500 || fees>10000)
		{
			throw new Exception("InvalidFeeException");
		}
		else{
		this.fees=fees;
		this.name=name;
		System.out.println("Successfull");
		}
	}
	
}