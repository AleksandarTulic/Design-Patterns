package primjer1;

import java.util.Stack;

public class PostorderIterator<T extends Comparable<T>> implements Iterator<T>{
	private BinaryTree<T> tree;
	private Node<T> current;
	private Stack<Node<T>> history;
	
	public PostorderIterator(BinaryTree<T> tree) {
		this.tree = tree;
		this.current = tree.getRoot();
		this.history = new Stack<Node<T>>();
	}
	
	@Override
	public Node<T> getNext() {
		Node <T> res = null;

		while (current != null) {
			if (current.l != null && current.r != null) {
				Node <T> buffer = new Node<>(current.value, null, current.r);
				history.add(buffer);
				current = current.l;
			}else if (current.l == null && current.r != null) {
				Node <T> buffer = new Node<>(current.value, null, null);
				history.add(buffer);
				current = current.r;
			}else if (current.l != null && current.r == null) {
				Node <T> buffer = new Node<>(current.value, null, null);
				history.add(buffer);
				current = current.l;
			}else {
				res = new Node<>(current.value, null, null);
				if (history.size() > 0) {
					current = history.pop();
				}else {
					current = null;
				}
				
				break;
			}
		}
		
		return res;
	}

	@Override
	public Boolean hasNext() {
		return current != null;
	}

	@Override
	public void reset() {
		current = tree.getRoot();
	}
}
