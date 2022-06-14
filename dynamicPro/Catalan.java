package dynamicPro;

public class Catalan {

	public static void main(String[] args) {
	
		int n =3;
		System.out.println(CatRecTD(n,new int [n+1]));
		System.out.println(CatBU(n));
	}
	
	public static int CatRec(int n)
	{
		if(n==1 || n==0)
		{return 1; }
		
		int total=0;
		
		for(int i=1;i<=n;i++)
		{
			int l= CatRec(i-1);
			int r =CatRec(n-i);
			
			int ans = l*r;
			total+=ans;
		}
	
	return total;}

	public static int CatRecTD(int n,int [] strg)
	{
		if(n==1 || n==0)
		{return 1; }
		
		if(strg[n]!=0)
		{return strg[n];}
		
		int total=0;
		
		
		for(int i=1;i<=n;i++)
		{
			int l= CatRecTD(i-1,strg);
			int r =CatRecTD(n-i,strg);
			
			int ans = l*r;
			total+=ans;
		}
	
		strg[n]= total;
	return total;}

	public static int CatBU(int n)
	{
		int strg[] = new int[n+1];
		
		strg[0]=strg[1]=1;
		
		
        
		for(int j=2;j<strg.length;j++)
		{
			
			int total=0;
			
			
			for(int i=1;i<=j;i++)
			{
				int l= strg[i-1];
				int r =strg[j-i];
				
				int ans = l*r;
				total+=ans;
			}
		
			strg[j]= total;
			
			
			
		}
		
          return strg[n];
	}
	
}
