package primjer1;

public class Node<T extends Comparable<T>> {
	public T value;
	public Node<T> l;
	public Node<T> r;
	
	public Node(T value) {	
		this.value = value;
		l = r = null;
	}
	
	public Node(T value, Node<T> l, Node<T> r) {	
		this.value = value;
		this.l = l;
		this.r = r;
	}
	
	@Override
	public String toString() {
		return "Value: " + value;
	}
}
