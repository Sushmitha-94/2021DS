
public class ArrayMethods {

	//traverse and print the arrau=y of class Friend
	public void traverse(Friend[] arr) {
		if(arr.length>0) {
			
			for(int i=0; i<arr.length;i++) {
				System.out.print(i+1);
				System.out.print("Name:"+ arr[i].friendName);
				System.out.print("  Mobile:"+ arr[i].phoneNumber);
				System.out.println("  Location:"+ arr[i].city);
				
			}
		}
	}
	
	//insert new Friend object at index
	public void insertAtIndex(Friend[] arr, int index, Friend fri) {
		if(arr.length>0) {
			for(int i=arr.length-1; i>=index; i--) {
				arr[i+1]=arr[i];
			}
			arr[index]=fri;
		}
		else
			arr[0] = fri;
	}
	
	// delete at the given index
	public void deleteAtIndex(Friend[] arr, int index) {
		if(arr.length>0) {
			for(int i=index;i<arr.length;i++) {
				arr[i]=arr[i+1];
			}
			arr[arr.length]=null;
		}
	}
	
	// Search by Index
	public void searchByIndex(Friend[] arr, int key) {
		if(arr.length>0) {
			System.out.println("At index: "+key+": "+ arr[key].friendName);				
		}
	}
	
	public static void main(String[] args) {
	
		//insert values to Array
		Friend[ ] friends = new Friend[5];			
		friends[0] = new Friend("Vidhya", 989898989, "London");
		friends[1] = new Friend("Sayee", 123456789, "Bangalore");
		friends[2] = new Friend("Nattu", 432456543, "Chennai");
		friends[3] = new Friend("Nive", 98989781, "Bangalore");
		ArrayMethods arr = new ArrayMethods();
		
		//traverse through array and print elements
		arr.traverse(friends);
		
		//Insert at given Index
		Friend newF = new Friend("Yash", 878787, "Kotagiri");
		arr.insertAtIndex(friends, 2, newF);
		
		//delete at given index
		arr.deleteAtIndex(friends, 1);
		
		//search by index
		arr.searchByIndex(friends, 1);
		
		/*  Selection Sort
			Bubble Sort
			Recursive Bubble Sort
			Insertion Sort
			Recursive Insertion Sort
			Merge Sort
			Iterative Merge Sort
			Quick Sort
			Iterative Quick Sort
			Heap Sort
			Counting Sort
			Radix Sort
			Bucket Sort
			ShellSort
			TimSort
			Comb Sort
			Pigeonhole Sort
			Cycle Sort
			Cocktail Sort
			Strand Sort
			Bitonic Sort
			Pancake sorting
			Binary Insertion Sort
			BogoSort or Permutation Sort
			Gnome Sort
			Sleep Sort – The King of Laziness / Sorting while Sleeping
			Structure Sorting (By Multiple Rules) in C++
			Stooge Sort
			Tag Sort (To get both sorted and original)
			Tree Sort
			Cartesian Tree Sorting
			Odd-Even Sort / Brick Sort
			QuickSort on Singly Linked List
			QuickSort on Doubly Linked List
			3-Way QuickSort (Dutch National Flag)
			Merge Sort for Linked Lists
			Merge Sort for Doubly Linked List
			3-way Merge Sort
		*/
		
		/*
		 *Linear Search
			Binary Search
			Jump Search
			Interpolation Search
			Exponential Search
			Sublist Search (Search a linked list in another list)
			Fibonacci Search
			The Ubiquitous Binary Search
			Recursive program to linearly search an element in a given array
			Recursive function to do substring search
			Unbounded Binary Search Example (Find the point where a monotonically increasing function becomes positive first time)
		*/
	}
}
