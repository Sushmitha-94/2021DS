import java.util.ArrayList;
import java.util.List;

public class TreeNode {
	public int data;
	public TreeNode parent;
	public List<TreeNode> child;
	
	public TreeNode(int data) {
		this.data = data;
		child = new ArrayList<TreeNode>();
	}
}
