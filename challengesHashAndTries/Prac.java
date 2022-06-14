package challengesHashAndTries;

import java.util.ArrayList;
import java.util.Collections;

public class Prac {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("rat");
		list.add("rats");
		list.add("rt");
		list.add("rack");
		
		for(String s : list)
		{System.out.print(s+" ");}
		
		System.out.println();
		Collections.sort(list);
		
		for(String s : list)
		{System.out.print(s+" ");}
		
		String s = "p";
		String s2 = s.substring(1);
		System.out.println();
		System.out.println("-"+s2.length()+"-");
		
		String s3 = "bat";
		String s4 = "batman";
		System.out.println(s3.compareTo(s4));
		String s5 = "abcdef";
		System.out.println(s5);
		String s6 =s5.substring(0,5)+"z"+s5.substring(6);
		System.out.println(s5.substring(0,5)+"z"+s5.substring(6));
		System.out.println(s6.length());
		System.out.println(s5.length());
		
		System.out.println(234 & 567);
		System.out.println(3^4);
		System.out.println("PPPPPPPPPP");
		String x = "aaaA";
		System.out.println(x.substring(0,3)+'a'+x.substring(4));
		System.out.println(1&2);
		
		System.out.println(2^2);
	}

}
