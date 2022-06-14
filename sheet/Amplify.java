package sheet;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Amplify {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long t = scn.nextLong();
		
		for(long wt=1;wt<=t;wt++)
		{
			long n = scn.nextLong();
			Long [] arr = new Long[(int) n];
			long ones=0;
			for(long a=0;a<n;a++)
			{arr[(int) a]=scn.nextLong();
			if(arr[(int) a]==1)ones++;
			}
			Arrays.sort(arr,Collections.reverseOrder());
			for(long a=0;a<ones;a++)
			{System.out.print(1+" ");}
			
			if(n-ones==2 && arr[0]==3 && arr[1]==2)
			{System.out.print(2+" "+3);}
			else
			{for(long a=ones;a<n;a++)
			{System.out.print(arr[(int) a]+" ");}}
			
			
		System.out.println();}

	}

}
