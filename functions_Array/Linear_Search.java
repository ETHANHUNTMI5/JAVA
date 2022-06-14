package functions_Array;

public class Linear_Search {

	public static void main(String[] args) {
		int [] array = {10,12,25,46,68,54,37};
		System.out.println(linear(array,54));
	}
       public static int linear(int [] arr, int item) {
         
       for(int a=0;a<arr.length;a++)
       {if (arr[a]==item)
       {return a;}
       
       }
      
       return -1;
       }

}
