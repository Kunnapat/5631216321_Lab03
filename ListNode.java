
public class ListNode {
	
	Object   element;
	ListNode next;
	
	
	ListNode( Object theElement )
	{
		this( theElement, null );
	}

	ListNode( Object theElement, ListNode n )
	{
		element = theElement;
		next    = n;
	}   
	// Friendly data; accessible by other package routines

}
