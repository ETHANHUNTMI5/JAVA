package leetCode;

import java.util.ArrayList;

public class PlusOne {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3};
		
		
		ArrayList<Integer> ll = new ArrayList<Integer>();
		
		int carry=0;
		for(int a=arr.length-1;a>=0;a--)
		{
			int get=arr[a];
			if(a==arr.length-1)
			{
				get+=1;
			}
	       
			if(get+carry>=10)
			{
				ll.add((get+carry)-10);
				carry=1;
			}
			else
			{
				ll.add(get+carry);
			}
		}
		
		if(carry==1)
		{ll.add(1);}
		
		System.out.println(ll);
	
		int [] ans = new int[ll.size()];
		
		for(int a=ll.size()-1;a>=0;a--)
		{
			ans[ll.size()-1-a]= ll.get(a);
			
		}
		
		for(int i :ans)
		{System.out.print(i+" ");}
		}
		
	}


