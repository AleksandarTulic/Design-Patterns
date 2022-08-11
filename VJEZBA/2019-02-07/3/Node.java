package zadatak1;

public class Node<T extends Comparable<T>> {
	public T value;
	public Node<T> l;
	public Node<T> r;
	
	public Node(T value) {	
		this.value = value;
		l = r = null;
	}
}
