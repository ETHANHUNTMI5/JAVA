package aatCoder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class G2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s1 = scn.nextLine();
		String s2 = scn.nextLine();
		String s3 = scn.nextLine();
		
		ArrayList<String> map = new ArrayList<String>();
		
		map.add("ABC");
		map.add("ARC");
		map.add("AGC");
		map.add("AHC");

		if(map.contains(s1))
		map.remove(s1);

		if(map.contains(s2))
		map.remove(s2);

		if(map.contains(s3))
		map.remove(s3);
		
		System.out.println(map.get(0));
	}

}
