import java.util.Scanner;

// Name: Susmitha Tamilselvan
// CS 5300 Advanced Algorithms
// Homework #4
/*
   Implement both algorithms for the Binomial Coefficient problem (Algorithms 3.1 and 3.2) 
   on your system and study their performance using different problem instances. 
   You can use any programming language.
 */
public class AlgoHW4 {
	
	//Algorithm 3.1 recursive method to find B(n,k)
	public static int bin(int n, int k) {
		if( k==0 || n==k)
			return 1;
		else
			return bin(n-1, k-1)+bin(n-1,k);
	}	
	//Algorithm 3.2 iterative method to find B(n,k)
	public static int bin2(int n, int k) {
		int i,j;
		int[][] B = new int[n+1][k+1];
		
		for(i=0; i<=n; i++) {
			for(j=0; j<=Math.min(i, k); j++) {
				if(j==0 || j==i)
					B[i][j] = 1;
				else
					B[i][j] = B[i-1][j-1] + B[i-1][j];
			}			
		}		
		return B[n][k];
	}
	public static void main(String[] args) {
		int input;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter input:/n1.Algorithm 3.1/n2.Algorithm 3.2/n");
		input = scan.nextInt();
		System.out.println("Enter n and k values to find Binomial Coefficient of B(n,k)");
		int n,k;
		n = scan.nextInt();
		k = scan.nextInt();
		if(input==1)
			System.out.println("B("+n+","+k+") using Algorithm 3.1: "+ bin(n,k));
		else if(input==2)
			System.out.println("B("+n+","+k+") using Algorithm 3.2: "+ bin2(n,k));
		else
			System.out.println("Invalid input");
	}
}
