package bst;

public class BSTclient {

	public static void main(String[] args) {
		
		
		int [] arr = {10,20,30,40,50,60,70};
      
		 BST tree = new BST(arr);
		 tree.display();
		System.out.println(tree.Find(5));
		tree.Add(69);
		tree.display();
		System.out.println(tree.Max());
	}

}
