//61.Create a Thread class to print following star (*) pattern on screen with delay of 1 second
//between each * print. Number of lines in the pattern should be passed to the constructor of 
//Thread class.  *  * * * *  * * * * * * * * * * Use this class in main method and ask user to enter 
//number of lines to print.

package Assignment;

import java.util.Scanner;

public class Assig61 {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no :");
		int no = sc.nextInt();
		
		ThreadDemo t = new ThreadDemo(no);
		t.pattern();
	}
}
class ThreadDemo{
	int no;
	public ThreadDemo(int no) {
		this.no=no;
	}
	
	void pattern() throws InterruptedException{
		for(int i=0;i<no;i++)
		{
			Thread.sleep(1000);
			for(int j = 0;j<no;j++)
			{
				try {
					System.out.print("*");
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println();
		}
	}
	
}