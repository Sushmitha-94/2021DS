
public class BTree {

	static BTreeNode head;

	public static void insertNode(BTreeNode source, int data) {
		if (head == null) {
			head = new BTreeNode(data);
		} else {
			if (data < source.data) {
				if (source.left == null)
					source.left = new BTreeNode(data);
				else
					insertNode(source.left, data);
			} else if (data > source.data) {
				if (source.right == null)
					source.right = new BTreeNode(data);
				else
					insertNode(source.right, data);
			} else
				System.out.println("Duplicate data");
		}
	}

	public static void deleteNode(int data) {
			
	}

	public static BTreeNode containsEle(BTreeNode node, int data) {
		if (node.data == data)
			return node;
		else if (data < node.data)
			return containsEle(node.left, data);
		else
			return containsEle(node.right, data);
	}

	public static void inOrder(BTreeNode node) {
		if (node != null) {
			inOrder(node.left);
			System.out.println(" " + node.data);
			inOrder(node.right);
		}
	}

	public static void preOrder(BTreeNode node) {
		if (node != null) {
			System.out.println(" " + node.data);
			preOrder(node.left);
			preOrder(node.right);
		}
	}

	public static void postOrder(BTreeNode node) {
		if (node != null) {
			postOrder(node.left);
			postOrder(node.right);
			System.out.println(" " + node.data);
		}
	}

	public static Boolean levelOrder(BTreeNode node, int level) {
		if (node == null)
			return false;
		if (level == 1) {
			System.out.println(" " + node.data);
			return true;
		} else {
			Boolean left = levelOrder(node.left, level - 1);
			Boolean right = levelOrder(node.right, level - 1);
			return left || right;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insertNode(head, 30);
		insertNode(head, 20);
		insertNode(head, 40);
		insertNode(head, 15);
		insertNode(head, 25);
		insertNode(head, 35);
		insertNode(head, 50);
		insertNode(head, 5);
		insertNode(head, 18);
		insertNode(head, 45);
		insertNode(head, 60);
		System.out.println("In Order:");
		inOrder(head);
		/*System.out.println("Pre Order:");
		preOrder(head);
		System.out.println("Post Order:");
		postOrder(head);
		System.out.println("Level Order:");
		levelOrderTraversal(head);
		System.out.println("Contains Element? : " + containsEle(head, 60).data);
		*/deleteNode(45);
		System.out.println("In Order:");
		inOrder(head);
	}

	private static void levelOrderTraversal(BTreeNode node) {
		int level = 1;
		while (levelOrder(node, level)) {
			level++;
		}
	}
}
