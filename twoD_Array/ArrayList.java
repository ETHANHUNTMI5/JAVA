package twoD_Array;

public class ArrayList {

	public static void main(String[] args) {
		
		java.util.ArrayList<Integer> list = new java.util.ArrayList<Integer>();
		System.out.println(list);
		System.out.println(list.size());
		
		list.add(10);
		list.add(20);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(5));
		
		list.remove(1);
		list.remove(1);
		System.out.println(list);
		System.out.println(list.size());
	
	}

}
