import java.util.Arrays;

public class Q17 {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		try {
			System.out.println("Element at index 1: " + linkedList.get(1));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
		}
		try {
			System.out.println("Element at index 10: " + linkedList.get(10));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
		}
	}

}

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class LinkedList {
	private Node[] arr;
	private int size;
	private int capacity;
	private static final int Def_cap = 10;

	public LinkedList() {
		this.capacity = Def_cap;
		this.arr = new Node[Def_cap];
		this.size = 0;
	}

	public void add(int data) {
		final_cap();
		Node newNode = new Node(data);
		arr[size++] = newNode;
	}

	private void final_cap() {
		if (size == capacity) {
			int newCapacity = capacity * 2;
			arr = Arrays.copyOf(arr, newCapacity);
			capacity = newCapacity;
		}
	}

	public int get(int index) {
		if (index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException("Index out of bounds");
		}
		return arr[index].data;
	}
}