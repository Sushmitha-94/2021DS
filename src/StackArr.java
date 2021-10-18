
public class StackArr {

	static int arr[],top;
	static int size;


	//push
	public static void push(int a) {
		if(!isFull()) {
			arr[++top]=a;
		}
		else
			System.out.println("Stack is full");
	}
	
	//pop
	public static void pop() {
		if(!isEmpty())
			arr[top--]=0;
		else
			System.out.println("Stack is empty");
	}
	
	//peek
	public static int peek() {
		if(!isEmpty())
			return arr[top];
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
	
	//Infix 
	
	//postfix
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		size = 10;
		arr = new int[100];
		top=-1;
		push(5);
		push(15);
		push(20);
		display();
		System.out.println("Peek:"+peek());
		pop();
		push(25);
		push(115);
		push(220);
		push(53);
		push(145);
		push(250);
		push(54);
		push(165);
		push(270);
		push(280);
		display();
		System.out.println("Peek:"+peek());
		
	}

}
