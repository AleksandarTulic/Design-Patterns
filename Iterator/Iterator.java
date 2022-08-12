package primjer1;

public interface Iterator<T extends Comparable<T>> {
	public Node<T> getNext();
	public Boolean hasNext();
	public void reset();
}
