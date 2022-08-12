package primjer1;

public class Main {

	public static void main(String[] args) {
		BinaryTree<Integer> tree = new BinaryTree<>();
		tree.add(5);
		tree.add(7);
		tree.add(8);
		tree.add(6);
		tree.add(3);
		tree.add(1);
		tree.add(4);
		
		Iterator<Integer> it = tree.createIteratorPreorder();
		
		System.out.println("ISPIS: ");
		while (it.hasNext()) {
			System.out.println(it.getNext().value);
		}
		
		it = tree.createIteratorPostorder();
		
		System.out.println("ISPIS: ");
		while (it.hasNext()) {
			System.out.println(it.getNext().value);
		}
		
		it = tree.createIteratorInorder();
		
		System.out.println("ISPIS: ");
		while (it.hasNext()) {
			System.out.println(it.getNext().value);
		}
	}

}
