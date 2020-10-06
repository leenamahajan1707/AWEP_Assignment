package Assignment;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter String : ");
		String s = sc.nextLine();
//		int count=1;
//		for(int i=0;i<s.length();i++)
//		{
//			if(s.charAt(i) == ' ' && s.charAt(i+1)!=' ')
//			{
//				count++;
//			}
//		}
//		System.out.println("word count = "+(count));
		
		int count=0;
		String splits[] = s.split(" ");
		for(String w:splits)
		{
			count++;
		}
		System.out.println(count);
	}

}
