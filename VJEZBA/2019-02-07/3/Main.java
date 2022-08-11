package zadatak1;

public class Main {

	public static void main(String[] args) {
		Traverse<Integer> pre = new PreOrder<>();
		Traverse<Integer> post = new PostOrder<>();
		Traverse<Integer> in = new InOrder<>();
		BinaryTree <Integer> tree = new BinaryTree<>();
		
		tree.add(5);
		tree.add(7);
		tree.add(6);
		tree.add(1);
		tree.add(4);
		
		tree.setTraverse(pre);
		tree.traverseTree();
		
		System.out.println("\n================================================\n");
		
		tree.setTraverse(post);
		tree.traverseTree();
		
		System.out.println("\n================================================\n");
		
		tree.setTraverse(in);
		tree.traverseTree();
	}

}
