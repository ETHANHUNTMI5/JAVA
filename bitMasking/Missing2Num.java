package bitMasking;

public class Missing2Num {

	public static void main(String[] args) {
		
		int [] arr = {2,4,5,3};
		int ans =0;
		for(int a=0;a<arr.length;a++)
		{
			ans = ans^arr[a];
		}
		//System.out.println(ans);
	  
	for(int a=1;a<=6;a++)
	  {ans = ans^a;}
	  
	  System.out.println(ans);
	  
	  int setBit= ans&~(ans-1);
	  System.out.println(setBit);
	  
	  int grp1=0;
	  int grp2=0;
	  
	  for(int a=0;a<arr.length;a++)
	  {
		  if((arr[a]&setBit)==setBit)
		  {grp1= grp1^arr[a];}
		  
		  else
		  {grp2= grp2^arr[a];}
	  }
	
	  
	  for(int a=1;a<=6;a++)
	  {
		  if((a&setBit)==setBit)
		  {grp1= grp1^a;}
		  
		  else
		  {grp2= grp2^a;}
	  }
	
	  System.out.println(grp1 + " "+ grp2);
	}

}
