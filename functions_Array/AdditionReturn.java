package functions_Array;

public class AdditionReturn {
 
	public static int val=20;
	public static void main(String[] args) {
		
		System.out.println("HELLO");
		System.out.println(val);
		int sum = addition(30,40);
		System.out.println(sum);
	
	}
     public static int addition(int a, int b)
     {int sum=a+b;
     return sum;}
}
