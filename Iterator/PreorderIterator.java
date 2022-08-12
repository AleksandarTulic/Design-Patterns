package primjer1;

import java.util.*;

public class PreorderIterator<T extends Comparable<T>> implements Iterator<T>{
	private BinaryTree<T> tree;
	private Node<T> current;
	private Stack<Node<T>> history;
	
	public PreorderIterator(BinaryTree<T> tree) {
		this.tree = tree;
		this.current = tree.getRoot();
		this.history = new Stack<Node<T>>();
	}
	
	@Override
	public Node<T> getNext() {
		Node <T> res = current;
		
		if (current != null) {
			if (current.l != null && current.r != null) {
				history.push(current.r);
				current = current.l;
			}else if (current.l == null && current.r != null) {
				current = current.r;
			}else if (current.l != null && current.r == null) {
				current = current.l;
			}else {
				if (history.size() > 0) {
					current = history.pop();
				}else {
					current = null;
				}
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
