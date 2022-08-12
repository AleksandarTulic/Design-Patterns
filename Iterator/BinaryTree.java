package primjer1;

public class BinaryTree <T extends Comparable<T>> implements IBinaryTree<T>{
	private Node <T> root;
	
	public BinaryTree() {
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

	@Override
	public Iterator<T> createIteratorPreorder() {
		return new PreorderIterator<T>(this);
	}

	@Override
	public Iterator<T> createIteratorPostorder() {
		return new PostorderIterator<T>(this);
	}

	@Override
	public Iterator<T> createIteratorInorder() {
		return new InorderIterator<T>(this);
	}
	
	public Node<T> getRoot(){
		return root;
	}
}
