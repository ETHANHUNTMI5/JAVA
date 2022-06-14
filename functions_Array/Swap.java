package functions_Array;

public class Swap {

	
	public static void main(String[] args) {
		int i=0,j=2;
		int [] arr= {10,20,30,40,50};
		System.out.println(arr[i]+ " "+ arr[j]);
		Swap(arr,i,j);
		System.out.println(arr[i]+ " "+ arr[j]);
		
	}
    public static void Swap(int [] arr,int i,int j)
    {System.out.println(arr[i]+ " "+ arr[j]);
    int temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
	System.out.println(arr[i]+ " "+ arr[j]);
	
    }
}
