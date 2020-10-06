//59.	Create a class Voter(voterId, name, age) with parameterized constructor.  The parameterized 
//constructor should throw a checked exception if age is less than 18. The message of exception is
//“invalid age for voter ” 
package Assignment;

import java.util.Scanner;

public class AssiThrow59 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter data : ");
		int voterId = sc.nextInt();
		String name = sc.next();
		int age = sc.nextInt();
		
		try {
			Voter obj = new Voter(voterId, name, age);
//			Voter obj = new Voter(101, "fsd",12);
			System.out.println("eligible for waiting");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
class Voter{
	int voterId;
	String name;
	int age;
	
	Voter(int voterId,String name,int age) throws Exception
	{
		this.voterId=voterId;
		this.name = name;
		if(age < 18)
		{
			throw new Exception("invalid age for voter!!!");
		}
		this.age = age;
	}
}