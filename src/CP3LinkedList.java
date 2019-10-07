import java.util.NoSuchElementException;
//singly linked list with first reference only 

/**
A linked list is a sequence of links with efficient
element insertion and removal. This class 
contains a subset of the methods of the standard
java.util.LinkedList class.
*/

public class CP3LinkedList<E> {
     private class Node {
		public E data;
		public Node next;
	}
	private Node first;
		
	/** 
    	Constructs an empty linked list.
	*/
	public CP3LinkedList()
	{  
		first = null;
	}
 
	/**
 	Adds an element to the front of the linked list.
 	@param element the element to add
	 */
	public void addFirst(E element)
	{  
		Node newLink = new Node();
		newLink.data = element;
		newLink.next = first;
		first = newLink;
	}

	public E getFirst() {
		if (first == null)
			throw new NoSuchElementException();
		return first.data;
	}

	public E removeFirst() {
		if (first == null)
			throw new NoSuchElementException();
		E element = first.data;
		first = first.next;
		return element;
	}

	public void print(){
		print(first);
	}

	private void print(Node head){
		if (head == null){
			System.out.println("");
		}
		else{
			print(head.next);
			System.out.println(head.data);
		}
	}

	public void printIterative(){

		//while(){

		//}
	}

	public static int fiboIterative(int n){
		int f = 0;

		int fPrevious = 1, fTwoPrevious = 0;

		if (n == 0){
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		for (int i = 2; i < n; i++){


			f = fPrevious + fTwoPrevious;

			fTwoPrevious = fPrevious;
			fPrevious = f;

		}
		System.out.println(f);
		return f;
	}
	public static void fiboRecursive(){
		//fiboRecursive(0,0);
	}

	public static int fiboRecursive(int n){

		int f=0;
		if (n == 0){
			return 0;
		}
		else if (n == 1){
			return 1;
		}else{
			f = fiboRecursive(n-1) + fiboRecursive(n-2);
		}

		System.out.println(f);
		return f;
		// Call itself down to n=1, return 1, reconstruct, adding itself and its call, and returning.


	}
}
