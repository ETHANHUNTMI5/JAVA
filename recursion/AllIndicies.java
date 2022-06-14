package recursion;

public class AllIndicies {

	public static void main(String[] args) {
		 
		int [] arr = {3,8,1,8,8,4};
            int [] array =Allindicies(arr, 0, 8, 0);
            display(array,0);
	}
public static int[] Allindicies(int [] arr,int si,int data,int count)
{
	if(si==arr.length)
	{int [] base = new int [count];
	return base;}
	
	int[] indicies = null;
	
	if(arr[si]==data)
	{indicies=Allindicies(arr,si+1,data,count+1);}
	
	else
	{indicies=Allindicies(arr,si+1,data,count);}
	
	
	if(arr[si]==data) 
	{indicies[count]=si;}


return indicies;}


public static void display(int [] arr,int a)
{
	if(a==arr.length)
	{return;}
	
	System.out.print(arr[a]+ " ");
	
	display(arr,a+1);
	
}




}

	
