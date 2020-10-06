//58.	Store name of weekdays in an array (starting from “Sunday” at 0 index). Ask day position 
//from user and print day name. Handle array index out of bound exception and give proper message if 
//user enter day index outside range (0-6). 
package Assignment;

import java.util.Scanner;

public class StoreWeekdays58 {

	public static void main(String[] args) {
		
		DisplayDay obj = new DisplayDay();
		Scanner sc =new Scanner(System.in);
		System.out.println("enter index : ");
		try {
			int pos = sc.nextInt();
			obj.display(pos);
		
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("enter index between 0 to 6");
			int pos = sc.nextInt();
			obj.display(pos);
		}
	}

}
class DisplayDay{
	void display(int pos) {
		String day[] = {"sunday","monday","tuesday","wednsday","thursday","friday","saturday"};
		
		System.out.println(day[pos]);
	}
}