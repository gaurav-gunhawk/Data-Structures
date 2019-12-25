class CreatingLinkedList
{
	Node head;
	public void addatLast(int data) {
		
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(head == null)
		{
			head = node;
		}
		else
		{
			Node n = head;
			while(n.next != null)
			{
				n = n.next;
			}
			n.next = node;
		}
		
	}
	
	public void showElements()
	{
		Node node = head;
		while(node.next != null)
		{
			System.out.println(node.data);
			node = node.next;
		}
	}
}

class Node
{
	int data;
	Node next;
}

public class LinkedList {
	public static void main(String args[])
	{
		CreatingLinkedList creatinglinkedlist = new CreatingLinkedList();
		
		creatinglinkedlist.addatLast(23);
		creatinglinkedlist.addatLast(56);
		creatinglinkedlist.addatLast(34);
		creatinglinkedlist.addatLast(90);
		
		creatinglinkedlist.showElements();

	}
}