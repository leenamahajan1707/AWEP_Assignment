//62.	Create a class that checks whether a given number is prime or not using  Runnable interface.
package Assignment;

import java.util.Scanner;

public class Assi62 {

	public static void main(String[] args) {
		System.out.println("enter no");
		Scanner sc = new Scanner(System.in);
		int no= sc.nextInt();
		prime p = new prime(no);
		Thread t =new Thread(p);
		t.start();
	}

}

class prime implements Runnable{
	int no;
	public prime(int no) {
		this.no = no;
	}

	@Override
	public void run() {
		int flag = 0;
		for(int i=2;i<no/2;i++)
		{
			if(no%i == 0 )
				flag = 1;
		}
		
		if(flag == 0)
			System.out.println(no+" is prime no ");
		else
			System.out.println(no+" not prime no");
	}
	
}
