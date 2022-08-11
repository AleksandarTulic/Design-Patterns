package zadatak1;

public class PreOrder<T extends Comparable<T>> implements Traverse<T>{

	@Override
	public void traverse(Node<T> node) {
		if (node != null) {
			System.out.println("VALUE: " + node.value);
			traverse(node.l);
			traverse(node.r);
        }
	}

}
