
public class QueueArr {

	static int arr[],top;
	static int size;


	//push
	public static void enqueue(int a) {
		
	}
	
	//pop
	public static void dequeue() {
		
	}
	
	//peek
	public static int peek() {
		return 0;
	}
	
	//IsFull
	public static Boolean isFull() {
		return false;
	}
	
	//ISEmpty
	public static Boolean isEmpty() {
		return false;
	}
	
	//display
	public static void display() {

	}
	
	//Infix 
	
	//postfix
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		size = 10;
		arr = new int[10];
		top=-1;
		enqueue(5);
		enqueue(15);
		enqueue(20);
		display();
		System.out.println("Peek:"+peek());
		dequeue();
		enqueue(25);
		enqueue(115);
		enqueue(220);
		enqueue(53);
		enqueue(145);
		enqueue(250);
		enqueue(54);
		enqueue(165);
		enqueue(270);
		enqueue(280);
		display();
		System.out.println("Peek:"+peek());
		
	}

}
