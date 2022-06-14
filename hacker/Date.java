package hacker;
import java.time.LocalDate;

import java.util.Scanner;
public class Date {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c= scn.nextInt();
				
		
		
		String ans =LocalDate.of(c, a, b).getDayOfWeek().name();
	 
		System.out.println(ans);
	}

}
