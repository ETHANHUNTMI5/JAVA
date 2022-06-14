package functions_Array;

import java.util.Scanner;

public class SG {

		String name;
		int marks;
		
		
		public SG(String name, int marks) {
		
			this.name=name;
			this.marks= marks;
		}
	
	
	
	

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		scn.nextLine();
		
		
		 SG [] arr2 = new SG[m];
		for(int a=0;a<m;a++)
		{
	     String s = scn.next();
	     int mx = scn.nextInt();
	     
	     arr2[a] = new SG(s, mx);
	     
	     scn.nextLine();
	     
		}
		
		
		Ans(arr2,n);
		
	}
	public static void Ans(SG[] arr,int m)
	{
		for(int i =0;i<arr.length-1;i++)
		{
			for(int j =0;j<arr.length-1-i;j++)
			{
				if(arr[j].marks<arr[j+1].marks)
				{
					SG temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		
		for(int i =0;i<arr.length-1;i++)
		{
			for(int j =0;j<arr.length-1-i;j++)
			{
				if(arr[j].marks==arr[j+1].marks)
				{
					if(arr[j].name.compareTo(arr[j+1].name)>0)
					{
						SG TEMP = arr[j];
						arr[j]= arr[j+1];
						arr[j+1]=TEMP;
						
					}
			}
		}
		
		}
		for(SG nn : arr)
		{if(nn.marks>m)
			System.out.println(nn.name+"->"+nn.marks);}
		
		
	

}}
