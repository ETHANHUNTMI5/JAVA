package stringChallenges;

import java.util.Scanner;

public class CharacterType {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char ch = scn.next().charAt(0);
		
		if(ch>='a' && ch<='z')
		{System.out.println("L");}
		else if(ch>='A' && ch<='Z')
		{System.out.println("U");}
	
		else
		{System.out.println("I");}
	}

}
