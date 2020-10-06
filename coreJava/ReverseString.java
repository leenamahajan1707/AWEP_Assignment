//54.	Write a program to reverse the given String.

package Assignment;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String rev = "";
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int len = s.length();
		
		for(int i = len-1 ; i>=0; i--)
		{
			rev = rev + s.charAt(i);	
		}
		
		System.out.println("Reverse of the string: " + rev);
	}
}
