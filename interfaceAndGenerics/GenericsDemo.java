package interfaceAndGenerics;

import java.util.Comparator;

public class GenericsDemo {

	public static void main(String[] args) {
		
//		Integer [] arr = {10,20,30,40,50};
//		String [] arr2= {"apple","ball","cat","dog","egg"};
//	
//		display(arr);
//		display(arr2);
		
		
		Car[] cars = new Car[5];
		
		cars[0]=new Car(100, 10000, "Red");
		cars[1]=new Car(600, 70000, "Blue");
		cars[2]=new Car(150, 60000, "Grey");
		cars[3]=new Car(50, 8000000, "Black");
		cars[4]=new Car(250, 1000000, "White");
		
		
		
	//bubble(cars);
		bubbleComparator(cars, new CarSpeedComparator());
		display(cars);
		bubbleComparator(cars, new CarPriceComparator());
		display(cars);
		bubbleComparator(cars, new CarColorComparator());
		display(cars); 
	}

	public static  <D>void display(D[] arr)
	{
		for(D val:arr)
		{
			System.out.println(val+" ");
		}
		System.out.println();

	
	}
	
	public static <T extends Comparable<T>>void bubble(T [] arr)
    {
    	for(int a=0;a<arr.length-1;a++)
    	{
    		for(int j=0;j<arr.length-1-a;j++)
    		{if((arr[j].compareTo(arr[j+1]))>0)
    		{T temp=arr[j];
    		arr[j]=arr[j+1];
    		arr[j+1]=temp;}
    		
    		}
    	}
    	
 }
	
	public static <T>void bubbleComparator(T [] arr,Comparator<T> c)
    {
    	for(int a=0;a<arr.length-1;a++)
    	{
    		for(int j=0;j<arr.length-1-a;j++)
    		{if(c.compare(arr[j], arr[j+1])>0)
    		{T temp=arr[j];
    		arr[j]=arr[j+1];
    		arr[j+1]=temp;}
    		
    		}
    	}
    	
    	
    }
}
