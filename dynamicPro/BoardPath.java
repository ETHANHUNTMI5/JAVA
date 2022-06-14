package dynamicPro;

public class BoardPath {

	public static void main(String[] args) {
 
		int n =1000;
		System.out.println(BPrec(0, n));
		System.out.println(BPTD(0, n,new int[n+1]));
		System.out.println(BPBU(n));
     	System.out.println(BPBUSE(n));

	}
	
// T(n)= 0(6^n)
public static int BPrec(int curr, int end)
{
	if(curr==end)
	{return 1;}
	
	if(curr>end)
	{return 0;}

	int count=0;
	  for(int i =1;i<=6;i++)
	  {count+=BPrec(curr+i, end);}

	  return count;
}

// T(n)= 0(n)  SC : n
public static int BPTD(int curr, int end,int [] arr)
{
	if(curr==end)
	{return 1;}
	
	if(curr>end)
	{return 0;}


	if(arr[curr]!=0)  // checking if already present
	{return arr[curr];}
	int count=0;
	  
	
	for(int i =1;i<=6;i++)
	  {count+=BPTD(curr+i, end,arr);}

	  arr[curr]=count;// store the values
	  return count;
}

public static int BPBU(int end)
{

	int [] arr = new int[end+6];
	
	arr[end]=1;
	
	for(int i = end-1;i>=0;i--)
	{
		arr[i]= arr[i+1]+arr[i+2]+arr[i+3]+arr[i+4]+arr[i+5]+arr[i+6];
		
	}
	return arr[0];
	


}

//T(n)= 0(n)  SC : 1
public static int BPBUSE(int end)
{

	int [] arr = new int[6];
	
	arr[0]=1;
	
	for(int slide = 1;slide<=end;slide++)
	{
		int sum = arr[0]+arr[1]+arr[2]+arr[3]+arr[4]+arr[5];
		arr[5]=arr[4];
		arr[4]=arr[3];
		arr[3]=arr[2];
		arr[2]=arr[1];
		arr[1]=arr[0];
		arr[0]=sum;
	}
	return arr[0];
	


}

}
