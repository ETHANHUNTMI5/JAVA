package aatCoder;

import java.util.ArrayList;
import java.util.Scanner;

public class F2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.nextLine();
		ArrayList<String> fn = new ArrayList<String>();
		ArrayList<String> sn = new ArrayList<String>();
		
		for(int a=0;a<n;a++)
		{
			String f = scn.nextLine();
			String s = scn.nextLine();
			
			fn.add(f);
			sn.add(s);
			scn.nextLine();
		}
		
		System.out.println(fn);
		System.out.println(sn);
	}

}
