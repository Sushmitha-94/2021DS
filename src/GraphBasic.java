import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
import java.util.List;

public class GraphBasic {
	
	public static Map<GNode, LinkedList<GNode>> adjGraph = new HashMap<>();
	
	// checks if the source and node is in adjGraph. If its not there, create an entry in adjGraph
	// retrieve the linkedlist and add the new edge to the source
	
	public static void insert(GNode node, GNode source) {
		if(!hasEdge(source,node)) {
			if(!adjGraph.containsKey(source)) {
				adjGraph.put(source, null);
			}
			if(!adjGraph.containsKey(node)) {
				adjGraph.put(node, null);
			}
			
			LinkedList<GNode> toIns = adjGraph.get(source);
			if(toIns==null)
				toIns = new LinkedList<GNode>();		
			toIns.add(node);
			adjGraph.put(source, toIns);
		}
	}
	
	//checks if the edge is already added or not
	public static Boolean hasEdge(GNode node, GNode target) {
		return adjGraph.containsKey(node) && adjGraph.get(node)!=null && adjGraph.get(node).contains(target);
	}
	
	//traverse from all the vertexes and print its adjacent values
	public static void traverse() {
		for(GNode source: adjGraph.keySet()) {
			System.out.println("Root: "+source.key);
			LinkedList<GNode> toTrav = adjGraph.get(source);
			if(toTrav!=null) {
				for(GNode trav: toTrav) {
					System.out.println(" "+ trav.key);
				}
			}
			System.out.println();
		}
		
	}
	
	//breadth first search traversal
	public static void bfsTraverse(GNode source) {
		List<GNode> visited = new ArrayList<GNode>();
		Queue<GNode> queue = new LinkedList<>();
		queue.add(source);
		
		while(!queue.isEmpty()) {
			GNode current = queue.remove();
			visited.add(current);
			System.out.println(current.key);
			LinkedList<GNode> toTrav = adjGraph.get(current);
			if(toTrav!=null) {
				for(int i=0; i<toTrav.size(); i++) {
					GNode toAdd = toTrav.get(i);
					if(toAdd!=null && !visited.contains(toAdd))
						queue.add(toAdd);
				}
			}
		}
		
	}
	
	public static void dfsTraverse(GNode source) {
		Stack<GNode> stack = new Stack<>();
		List<GNode> visited = new ArrayList<GNode>();
		stack.push(source);
		
		while(!stack.isEmpty()) {
			GNode current = stack.pop();
			visited.add(source);
			System.out.println(current.key);
			LinkedList<GNode> toTrav = adjGraph.get(current);
			if(toTrav!=null) {
				for(int i=0; i<toTrav.size(); i++) {
					GNode toAdd = toTrav.get(i);
					if(toAdd!=null && !visited.contains(toAdd))
						stack.push(toAdd);
				}
			}
		}
		
	}
	
	//Shortest path
	
	//Cycle detection
	
	//Minimum spanning tree
	
	//strongly connected components
	
	//Topological sorting
	
	//Graph coloring
	
	//Maximum flow
	
	//Matching
	
	
	/*
	Add Vertex − Adds a vertex to the graph.
	Add Edge − Adds an edge between the two vertices of the graph.
	Display Vertex − Displays a vertex of the graph.
	*/
	
	public static void main(String[] args) {
		GNode node1 = new GNode(1);
		GNode node2 = new GNode(2);
		GNode node3 = new GNode(3);
		GNode node4 = new GNode(4);
		GNode node5 = new GNode(5);
		
		insert(node2, node1);
		insert(node3, node2);
		insert(node4, node2);
		insert(node5, node3);
		insert(node1, node2);
		
		traverse();
		
		System.out.println(" Edge from 5 to 1: "+ hasEdge(node5,node1));
		System.out.println(" Edge from 2 to 1: "+ hasEdge(node2,node1));
		
		System.out.println("BFS:");
		bfsTraverse(node1);
		System.out.println("DFS:");
		dfsTraverse(node1);
	}
}

