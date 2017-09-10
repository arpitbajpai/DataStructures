/**
 * @author Arpit
 * Node class to store the data and link to next node in a linked list
 */
class Node
{
	int data;
	Node next;
	public Node(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}
	
}

/**
 * Linked List Implementation
 *
 */
public class LinkedList {
	private Node head;
	
	/**
	 * Method to insert new element in the linked list
	 * @param data
	 */
	public void insert(int data)
	{
		Node temp = new Node(data,null);
		if(head==null)		
			head = temp;
		else
		{
			Node trav;
			for(trav=head;trav.next!=null;trav=trav.next);
			trav.next=temp;
		}
	}
	
	
	/**
	 * Method to remove an element from the linked list at the given position
	 * Assumption: Indexing starts from 1
	 * @param pos
	 */
	public void remove(int pos)
	{
		Node trav=head;
		Node prev=null;
		if(pos==1)
		{
			head = head.next;
			return;
		}
		for(int i=1;i<pos;i++)
		{
				prev =trav;
				trav= trav.next;
			
		}
			prev.next = trav.next;
		
	}
	
	/**
	 * Method to retrieve an element from linked list present at given position
	 * Assumption: Indexing starts from 1
	 * @param pos
	 * @return
	 */
	public int retrieve(int pos)
	{
		Node trav = head;
		for(int i=1;i<pos;i++)
		{
			trav = trav.next;
		}
		return trav.data;
	}
	
	/**
	 * Method to display the complete linked list
	 */
	public void displayList()
	{
		Node trav;
		for(trav=head; trav.next!=null;trav=trav.next)
		{
			System.out.print(trav.data+"->");
		}
		System.out.print(trav.data);
	}

}
