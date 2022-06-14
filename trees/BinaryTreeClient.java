package trees;

public class BinaryTreeClient {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.display();
 System.out.println();
		tree.preOrder();
 System.out.println();
		tree.postOrder();
		System.out.println();
		tree.InOrder();
		System.out.println();
		tree.levelOrder();
		System.out.println();
		System.out.println(tree.height());
	  
		System.out.println(tree.isBST());
		tree.Inorder2();
	     System.out.println();
		System.out.println(tree.diameter());
	 
		System.out.println(tree.sumLeaf());
	}

}
//100 true 80 true 70 false false true 60 true 30 false false false true 90 true 50 false false true 40 false false 