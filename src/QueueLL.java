
public class QueueLL {

	public static QNode rear,front;
	public static int queueSize = 0;
	//Enqueue
		public static void enqueue(int a) {
			
			QNode toIns = new QNode(a);
			if(rear==null) {
				queueSize++;
				rear = front = toIns;				
			}
			else if (!isFull()) {
				queueSize++;
				rear.next = toIns;
				rear = toIns;
			}
			else
				System.out.println("Queue is full");
		}
		
		//Dequeue
		public static int dequeue() {
			int toRet = 0;
			if(!isEmpty()) {
				queueSize--;
				toRet = front.key;
				front = front.next;			
			}
			return toRet;			
		}
		
		//front element
		public static int front() {
			if(!isEmpty())
				return front.key;
			return 0;
		}
		
		//IsFull
		public static Boolean isFull() {
			if(queueSize==10)
				return true;
			return false;
		}
		
		//ISEmpty
		public static Boolean isEmpty() {
			if(queueSize==0)
				return true;
			return false;
		}
		
		//display
		public static void display() {
			QNode trav = front;
			while(trav!=null) {
				System.out.println(trav.key);
				trav = trav.next;
			}
		}
		

		
		public static void main(String[] args) {
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


