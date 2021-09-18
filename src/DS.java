import java.util.Scanner;

public class DS {

	public static void main(String[] args) {
		
		// Get input from user on which data structure to use
		Scanner scanner = new Scanner(System.in);
		int inputValue ;
		System.out.println("Please choose the data structure to explore:");
		System.out.println("1. Array\n2. Linked List\n3. Doubly Linked List\n4. Circular Linked List"
				+ "\n5. Stack\n6. Queue\n7. BT\n8. BST\n9. Red Black Tree\n10. B+ Tree\n"
				+ "11. Weighted Balanced Tree\n12. AVL Tree\n13. Spanning Tree\n14. Min-Heap\n"
				+ "15. Max-Heap\n16. Hash Table\n17. Graph");
		inputValue = scanner.nextInt();
		if(inputValue==1) {
			//Array
		}
		else if(inputValue==2) {
			//Linked List
		}
		else if(inputValue==3) {
			//Doubly Linked List
		}
		else if(inputValue==4) {
			//Circular Linked List
		}
		else if(inputValue==5) {
			//Stack
		}
		else if(inputValue==6) {
			//Queue
		}
		else if(inputValue==7) {
			//BT
		}
		else if(inputValue==8) {
			//BST
		}
		else if(inputValue==9) {
			//Red Black Tree
		}
		else if(inputValue==10) {
			//B+ Tree
		}
		else if(inputValue==11) {
			//Weighted Balanced Tree
		}
		else if(inputValue==12) {
			//AVL Tree
		}
		else if(inputValue==13) {
			//Spanning Tree
		}
		else if(inputValue==14) {
			//Min-Heap
		}
		else if(inputValue==15) {
			//Max-Heap
		}
		else if(inputValue==16) {
			//Hash Table
		}
		else if(inputValue==17) {
			//Graph
		}
		else {
			System.out.println("Invalid input");
		}
	}

}
