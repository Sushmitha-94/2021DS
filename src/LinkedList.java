
public class LinkedList {
	static Node head;
	
	public static class Node {
		
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
		
	}
	
	//insert new node	
	public static void insertFirst(Node node) {
		if(head==null) {
			head=node;
		}
		else {			
			node.next = head;
			head = node;
		}
	}
	
	//insert at position
	public static void insertAtPos(Node node, int pos) {
		Node currNode = head;
		Node nextNode = head.next;
		if(pos==1) {
			node.next = head;
			head = node;
		}
		else {
			for(int i=2; i<pos; i++) {
				currNode = currNode.next;
				nextNode = nextNode.next;
			}
			currNode.next = node;
			node.next = nextNode;
		}		
	}
	
	//print linked list
	public static void printLL() {
		Node node = head;
		if(head!=null) {
			while(node!=null){
				System.out.println(node.data);
				node = node.next;
			}
		}
	}
	
	//delete by key
	public static void deleteByKey(int key) {
		if(head!=null && head.data!=key) {
			Node node = head.next;
			Node prev = head;
			while(node!=null) {
				if(node.data == key) {
					break;
				}
				else {
					prev = node;
					node = node.next;					
				}
			}
			prev.next = node.next;
		}
	}
	
	
	
	public static void main(String args[]) {
		insertFirst(new Node(10));
		insertFirst(new Node(8));
		insertFirst(new Node(6));
		insertAtPos(new Node(7), 2);
		insertAtPos(new Node(9),4);
		deleteByKey(9);
		insertAtPos(new Node(19),4);
		printLL();
	}
	
}
