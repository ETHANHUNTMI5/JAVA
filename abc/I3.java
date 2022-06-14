package abc;

import java.util.LinkedList;
import java.util.Scanner;

public class I3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int k = scn.nextInt();
		scn.nextLine();
		String s = "0?10";
		
		LinkedList<Character> ll = new LinkedList<Character>();
		
		int ans=0;
		for(int a=0;a<s.length();a++)
		{	
			ll.add(s.charAt(a));
			
		}
		System.out.println(ll);

		
	}
}