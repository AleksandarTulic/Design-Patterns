package zadatak1;

public class InOrder <T extends Comparable<T>> implements Traverse<T>{

	@Override
	public void traverse(Node<T> node) {
		if (node != null) {
			traverse(node.l);
			System.out.println("VALUE: " + node.value);
			traverse(node.r);
        }
	}

}
