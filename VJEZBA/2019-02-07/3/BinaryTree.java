package zadatak1;

public class BinaryTree <T extends Comparable<T>>{
	private Node <T> root;
	private Traverse<T> traverse;
	
	public BinaryTree() {
	}
	
	public BinaryTree(Traverse<T> traverse) {
		this.setTraverse(traverse);
	}
	
	public void add(T value) {
		this.root = addRecursive(root, value);
	}
	
	private Node<T> addRecursive(Node<T> current, T value){
		if (current == null)
			return new Node<T>(value);
		
		if (value.compareTo(current.value) < 0)
			current.l = addRecursive(current.l, value);
		else if (value.compareTo(current.value) > 0)
			current.r = addRecursive(current.r, value);
		
		return current;
	}

	public Traverse<T> getTraverse() {
		return traverse;
	}

	public void setTraverse(Traverse<T> traverse) {
		this.traverse = traverse;
	}
	
	public void traverseTree() {
		traverse.traverse(root);
	}
}
