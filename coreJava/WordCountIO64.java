//64.	Write a program to count no of words in a text file and average word size
package Assignment;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;  
   
public class WordCountIO64   
{  
    public static void main(String[] args) throws IOException {  
        String line;  
        int count = 0;  
        String path ="D:\\cdac\\java\\WordCountAvg.txt";
       
        FileReader file = new FileReader(path);  
        BufferedReader br = new BufferedReader(file);  
              
       
        while((line = br.readLine()) != null) {  
            //Splits each line into words  
            String words[] = line.split(" ");  
            //Counts each word  
            count = count + words.length;  
        }  
        
        
        
        FileInputStream fis = new FileInputStream(path);
        int ch=1;
        int charCount=0;
        while((ch=fis.read())!=-1) {
			charCount++;
		}
        System.out.println("Number of words present in given file: " + count);  
        float avg = charCount/count;
        System.out.println("Average of chars present in words : " + avg);
        br.close();  
    }  
}  