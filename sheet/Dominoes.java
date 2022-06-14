package sheet;

public class Dominoes {

	public static void main(String[] args) {

		String s = ".R..L.";
	
		int n = s.length();
		int [] arr = new int[n];
		
		for(int a=0;a<n;a++)
		{
			char cc = s.charAt(a);
			
			if(cc=='.')
			{
				arr[a]=0;
			}
			else if(cc=='L')
			{
				arr[a]=-1;
			}
			else
			{
				arr[a]=1;
			}
		}
//		for(int i : arr)
//		{System.out.print(i+" ");}
//		System.out.println();
//		
		
		int r=-1;
		int l=n;
		
		int num = 0;
		int idx=-1;
		for(int a=0;a<n;a++)
		{
			
			if(arr[a]==-1)
			{l=a;
			num=-1;
			idx=a;}
			if(arr[a]==1)
			{r=a;
			num=1;
			idx=a;}
			
			
			
			if(arr[a]==0)
			{
				int b =a;
				
				while( b<n && arr[b]==0)
				{b++;}
				
				if(b>=n)
				{break;}
				
				if(arr[b]==-1)
				{
					if(num==-1)
					{
						int c=b;
						while(c!=idx)
						{arr[c]=-1;
						c--;}
						num=-1;
						idx=b;
						continue;
					}
					
					l=b;
					fill(arr, r, l, n);
				
					
					num=-1;
					idx=b;
					
				}
				else
				{
					
					if(num==1)
					{
						int c=b;
						while(c!=idx)
						{arr[c]=1;
						c--;}
						num=1;
						idx=b;
						continue;
						
					}
				     r=b;
					fill(arr,r,l,n);
					
					num=+1;
					idx=b;
				}
				
				a=b;
			}
			for(int i : arr)
			{System.out.print(i+" ");}
			System.out.print(" -->"+r+" "+l+" "+idx+" "+num+" "+a);
			System.out.println();
			
			
		}
		if(r>l)
		{
			while(r!=n)
			{
				arr[r]=1;
				r++;
			}
		}
		String ans="";
		for(int a=0;a<n;a++)
		{
			if(arr[a]==0)
			{
				ans+=".";
			}
			else if(arr[a]==-1)
			{
				ans+="L";
			}
			else
			{
				ans+="R";
			}
				
			
		}
		
		//System.out.println();
		System.out.println(ans);
		
	}
	public static void fill(int [] arr , int r , int l,int n)
	{
		if(l<r)
		{	
		return ;}
		
		if(r==-1 && l<n)
		{int a=0;
			while(a!=l)
			{
				arr[a]=-1;
				a++;
			}
			return;
			
		}
		
		else if(l==n && r>-1)
		{
			int a=r;
			
			while(a<l)
			{
				arr[a]=1;
				a++;
			}
			return;
		}
		
		int get = l-r;
		if((get)%2==0)
		{
			get=get-1;
			get=get/2;
			int a=0;
			
			while(a!=get)
			{
				arr[r+1+a]=1;
				a++;
			}
			
			a=0;
			while(a!=get)
			{
				arr[l-1-a]=-1;
				a++;
			}
			
		}
		
		else
		{
			get=get/2;
            int a=0;
			
			while(a!=get)
			{
				arr[r+1+a]=1;
				a++;
			}
			
			a=0;
			while(a!=get)
			{
				arr[l-1-a]=-1;
				a++;
			}
			
			
		}
		
	}
}