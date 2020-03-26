package linkedList;

public class LinkedList {

	private class node {

		int data;
		node next;

		public node(int data) {
			this.data = data;
		}

		public node() {

		}

	}

	private node head;
	private node tail;
	private int size;

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public int getFirst() throws Exception {

		if (isEmpty()) {
			throw new Exception("LL is empty");
		}

		return this.head.data;
	}

	public int getLast() throws Exception {

		if (isEmpty()) {
			throw new Exception("LL is empty");
		}

		return this.tail.data;
	}
	
	

}
