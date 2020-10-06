package Assignment;

public class ConvertFirstLetterCapital {


	public static void main(String[] args){
		String s = "this is to be title cased";
		String[] splits = s.split(" ");
		String result =" ";
		for(String w : splits)
		{
			result += toTitleCase(w)+" ";
		}
		 System.out.println(result.trim());
	}

public static String toTitleCase(String w) {
	
	return Character.toUpperCase(w.charAt(0))+w.substring(1);
}
}


