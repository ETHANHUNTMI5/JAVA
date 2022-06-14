package abc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        
		int max =-1;
		int min=101;
		ArrayList<Integer> ll = new ArrayList<Integer>();
		for(int w=1;w<=3;w++)
		{	int a= scn.nextInt();
		
		  ll.add(a);
		}
 
		Collections.sort(ll);
		
		if(ll.get(0)+ll.get(2)==2*ll.get(1))
		{
			System.out.println("Yes");
		}	
		
		else
		{System.out.println("No");}
	}

}
