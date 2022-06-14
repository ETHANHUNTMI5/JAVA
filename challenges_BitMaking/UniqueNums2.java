package challenges_BitMaking;

import java.util.Scanner;

public class UniqueNums2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		
		int get =0;
		for(int a=0;a<n;a++)
		{
			arr[a]= scn.nextInt();
		
		   get = get ^arr[a];
		}
		
		int setBit = (get)&~(get-1);
		int grp1=0;
		int grp2=0;
		
		for(int a=0;a<n;a++)
		{
			if((arr[a]&setBit)==setBit)
			{
				grp1 = grp1^arr[a];
			}
			
			else
			{
				grp2 = grp2^arr[a];
			}
		}
		
		if(grp2>grp1)
		System.out.println(grp1+" "+grp2);
		
		else
		{System.out.println(grp2+" "+grp1);}
	}

}
