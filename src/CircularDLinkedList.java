public class CircularDLinkedList {

	static Node head = null;
	
	public static class Node{
		int data;
		Node previous;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	
	//insert new node
	public static void insertFirst(Node node) {
		if(head==null) {
			head = node;
			head.previous = node;
			head.next = node;
		}
		else {
			node.next = head;
			node.previous = head.previous;
			head.previous =node;
			node.previous.next = node;
			head = node;
			
		}
	}
	
	//insert at position
	public static void insertAt(Node node, int pos) {
		Node currNode = head;
		if(pos==1) {
			insertFirst(node);
		}
		else {
			currNode = currNode.next;
			for(int i=2; i<pos; i++) {
				if(currNode!=null)
					currNode = currNode.next;
			}
			
			currNode.previous.next = node;
			node.previous = currNode.previous;
			node.next = currNode;
			currNode.previous = node;
		}
	}
	
	//print linked list
	public static void printll() {
		Node node =head;
		do{
			System.out.println(node.data);
			node = node.next;
		}while(node!=head);
		
	}
	
	// print backwards
	public static void printBacK() {
		Node node = head;
		while(node.next!=null) {
			node = node.next;
		}
		while(node!=head) {
			System.out.println(node.data);
			node = node.previous;
		}
	}
	
	
	//delete by key
	public static void deleteKey(int key) {
		Node node=head;
		while(node!=null) {
			if(node.data==key) {
				node.previous.next = node.next;
				node.next.previous = node.previous;
				if(node==head)
					head = node.next;
				break;
			}
			node = node.next;
		}
	}
	
	// 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		insertFirst(new Node(10));
		insertFirst(new Node(8));
		insertFirst(new Node(7));
		insertFirst(new Node(5));
		insertFirst(new Node(3));
		insertAt(new Node(9),5);
		insertAt(new Node(2),1);
		printll();
		System.out.println("After 6 inserted:");
		insertAt(new Node(6),4);
		printll();
		deleteKey(7);
		System.out.println("Delete 7:");
		printll();
		//printBacK();
	}

}
