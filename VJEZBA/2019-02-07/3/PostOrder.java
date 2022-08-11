package zadatak1;

public class PostOrder <T extends Comparable<T>> implements Traverse<T>{

	@Override
	public void traverse(Node<T> node) {
		if (node != null) {
			traverse(node.l);
			traverse(node.r);
            System.out.println("VALUE: " + node.value);
        }
	}

}
