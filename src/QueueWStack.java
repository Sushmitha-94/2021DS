import java.util.Arrays;
import java.util.Stack;

public class QueueWStack {

	public static Stack<Integer> stack1 = new Stack<Integer>();
	public static Stack<Integer> stack2 = new Stack<Integer>();
	
	//enqueue - push the element to stack1
	public static void enqueue(int a) {
		stack1.push(a);
	}
	
	//dequeue - pop stack1 to statck2, pop from stack2, push stack2 to stack1
	public static void dequeue() {
		while(!stack1.isEmpty())
			stack2.push(stack1.pop());
		stack2.pop();
		stack1.clear();
		while(!stack2.isEmpty())
			stack1.push(stack2.pop());
		stack2.clear();
	}
	
	public static void main(String[] args) {
		enqueue(5);
		enqueue(15); 
		enqueue(20); 
		display(); 
		front(); 
		dequeue(); 
		enqueue(25);
		enqueue(115); 
		enqueue(220); 
		enqueue(53); 
		enqueue(145); 
		enqueue(250);
		enqueue(54); 
		enqueue(165); 
		display(); 
		front();
		
	}

	// print first element in the queue
	private static void front() {
		while(!stack1.isEmpty())
			stack2.push(stack1.pop());
		System.out.println(stack2.peek());
		stack1.clear();
		while(!stack2.isEmpty())
			stack1.push(stack2.pop());
		stack2.clear();
	}

	private static void display() {
		System.out.println(Arrays.toString(stack1.toArray()));		
	}
}
