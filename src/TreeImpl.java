
public class TreeImpl {
	
	public static TreeNode head;
	
	public static void insertNode(TreeNode node, TreeNode parent) {
		if(head==null) {			
			head = node;
		}
		else {
			TreeNode temp = node;
			temp.parent = parent;
			parent.child.add(temp);
		}
	}
	
	public static void deleteNode(int data) {
		TreeNode temp = searchNode(head , data);
		if(temp != null)
			temp.parent.child.remove(temp);
		else
			System.out.println("Invalid data to delete");
	}
	
	
	public static void printTree(TreeNode node) {
		System.out.println(" "+ node.data);
		for(TreeNode child: node.child) {
				printTree(child);
		}
	}
	
	public static TreeNode searchNode(TreeNode node, int data) {
		TreeNode toRet = null;		
		if(node!=null && toRet==null) {
			if(node.data != data) {
				for(TreeNode child: node.child) {
					TreeNode check = searchNode(child, data);
					if(check!=null) {
						return check;
					}
				}
			}
			else {
				toRet = node;
			}			
		}
		return toRet;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode hNode = new TreeNode(7);
		insertNode(hNode, null);
		TreeNode sNode = new TreeNode(1);
		insertNode(sNode, hNode);
		TreeNode s1Node = new TreeNode(3);
		insertNode(s1Node, hNode);
		TreeNode s2Node = new TreeNode(2);
		insertNode(s2Node, sNode);
		TreeNode s3Node = new TreeNode(4);
		insertNode(s3Node, s1Node);
		printTree(head);
	}

}
