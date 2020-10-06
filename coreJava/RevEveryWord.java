//57.	Write a program to reverse every word of the String.
package Assignment;

public class RevEveryWord {
	public void revWord(String str) {
		String[] word = str.split(" ");
		String  strrev=" ";
		
		for(int i=0;i<word.length;i++)
		{
			String w = word[i];
			
			String revword=" ";
			for(int j=w.length()-1;j>=0;j--)
			{
				revword += w.charAt(j); 
			}
			strrev += revword+" "; 
		}
		System.out.println(strrev.trim());
	}

	public static void main(String[] args) {
		String str = "reverse every string";
		RevEveryWord obj=new RevEveryWord();
		obj.revWord(str);
	}

}
