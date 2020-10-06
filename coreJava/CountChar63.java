//63.	Write a program to count how many times character ‘t’ occurs in a file. 
package Assignment;

public class CountChar63 {

	public static void main(String[] args) {
		String s = "this is the prog to count t ";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) == 't')
			{
				count++;
			}
		}
		System.out.println("t = "+count);
	}

}
