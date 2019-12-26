
		/* There can be many methods but here Basically I have discussed two methods in this program to find the 'middle element of the Linked List' */

					/* If the elements in the Linked List will be like like this --> 23,65,47,54,98  --> middle element will be "47" */

					/* If the elements in the Linked List will be like like this --> 23,65,47,54,98,73 --> middle element will be "54" */


class CreatingLinkedList
{
	Node head;
	public void addatLast(int data)
	{		
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
	
	/* This is the First method */
	
	/* 1. First we need to check how many elements in the Linked list , 
	 * 	  so for that we will traverse the linked list and store the count 
	 * 	  of elements in variable 'i'. 
	 * 2. Then , we will divide the number (i.e. i/2).
	 * 3. Print the data present in that node.
	 *  */
	public void middleElement_Method1()
	{
		int i=0;
		Node node = head;
		while(node.next != null)			//Traversing elements in Linked List.
		{
			System.out.println(node.data);
			node = node.next;
			i++;							//Getting count how much elements present in Linked List.
		}
		
		System.out.println("Total elements in the Linked List is : " + i);
		Node node_n = head;
		for(int a=0; a<=i/2 ; a++)			
		{
			node_n = node_n.next;
		}
		System.out.println("Middle element is ");
		System.out.println(node_n.data);	//Print the data of that node.
	}
	
	
	/* This is the Second Method */
	
	/* 1. We will use two variables to store the on which node we are at present.
	 * 2. fast_ptr_node will move fast by two. 
	 * 3. slow_ptr_node will only move one.
	 * 4. It means when fast_ptr_node will reach at the end the slow_ptr_node will
	 * 	  be at the middle of the Linked List.
	 * 5. Print the element in the node slow_ptr_node.
	 */
	
	public void middleElement_Method2()
	{
		Node fast_ptr_node = head;
		Node slow_ptr_node = head;
		
		while(fast_ptr_node != null && fast_ptr_node.next != null)
		{
			fast_ptr_node = fast_ptr_node.next.next;
			slow_ptr_node = slow_ptr_node.next;
		}
		System.out.println(slow_ptr_node.data);
	}
}

public class Print_the_middle_element_of_Linked_List {
	public static void main(String args[])
	{
		
		CreatingLinkedList creatinglinkedlist = new CreatingLinkedList();
		
		/* Adding the values to the Linked List */
		
		creatinglinkedlist.addatLast(23);
		creatinglinkedlist.addatLast(56);
		creatinglinkedlist.addatLast(34);
		creatinglinkedlist.addatLast(82);
		creatinglinkedlist.addatLast(67);
		creatinglinkedlist.addatLast(99);
		
		System.out.println("Output with First Method");
		creatinglinkedlist.middleElement_Method1();
		System.out.println();
		
		System.out.println("Output with Second Method");
		System.out.println("Middle element is ");
		creatinglinkedlist.middleElement_Method2();
		
		
	}

}
