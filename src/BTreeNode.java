
public class BTreeNode {
	public int data;
	public BTreeNode left;
	public BTreeNode right;
	
	public BTreeNode(int data) {
		this.data = data;
		right = null;
		left = null;
	}
}
