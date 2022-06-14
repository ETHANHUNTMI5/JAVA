package sheet;

import java.util.ArrayList;

public class SmallestNumMultiply {

	public static void main(String[] args) {
		int n =100;
		
		if(n<=9)
		{System.out.println(n+10);
		return;}
		
		ArrayList<Integer> ll = new ArrayList<>();
		for(int i =9;i>=2;i--)
		{
			while(n%i==0)
			{
				ll.add(i);
				n=n/i;
			}
			
		}
		int ans=0;
		for(int a=ll.size()-1;a>=0;a--)
		{ans=ans*10+ll.get(a);}
		System.out.println(ans);
		System.out.println(Math.random());
	}
}