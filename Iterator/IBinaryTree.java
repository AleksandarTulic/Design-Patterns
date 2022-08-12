package primjer1;

public interface IBinaryTree<T extends Comparable<T>> {
	Iterator<T> createIteratorPreorder();
	Iterator<T> createIteratorPostorder();
	Iterator<T> createIteratorInorder();
}
