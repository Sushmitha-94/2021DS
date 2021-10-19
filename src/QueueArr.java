
public class QueueArr {

	static int arr[],top;
	static int size;


	//Enqueue
	public static void enqueue(int a) {
		if(!isFull())
			arr[++top]=a;
		else
			System.out.println("Queue is full");
	}
	
	//Dequeue
	public static void dequeue() {
		if(!isEmpty()) {
			for(int i=1;i<=top;i++) {
				arr[i-1]=arr[i];
			}
			arr[top--]=0;
		}
		else
			System.out.println("Queue is empty");
	}
	
	//front element
	public static int front() {
		if(!isEmpty())
			return arr[0];
		return 0;
	}
	
	//IsFull
	public static Boolean isFull() {
		if(arr!=null && top+1>=size)
			return true;
		return false;
	}
	
	//ISEmpty
	public static Boolean isEmpty() {
		if(top==-1)
			return true;
		return false;
	}
	
	//display
	public static void display() {
		for(int i=0;i<=top;i++) {
			System.out.println(arr[i]);
		}
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		size = 10;
		arr = new int[10];
		top=-1;
		enqueue(5);
		enqueue(15);
		enqueue(20);
		display();
		System.out.println("front:"+front());
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
		System.out.println("front:"+front());
		
	}

}
