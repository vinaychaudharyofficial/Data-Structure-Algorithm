package recursion;

public class Fibonacci_Recusrion_Iteration {

	public int fibHead(int n) {
		
		if(n==0) return 0;
		if(n==1) return 1;
		
		int result1 = fibHead(n-1);
		int result2 = fibHead(n-2);
		int result=result1+result2;
		return result;
	}
	
	public int fibTail(int n, int a, int b) {
		if(n==0) return a;
		if(n==1) return b;
		
		return fibTail(n-1, b, a+b);
	}
	
	public void fibIteration(int n) {
		int a=0;
		int b=1;
				
		while(a<=n) {
			System.out.print(a +" ");
			int temp = a;
			a = b;
			b = a+temp;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Fibonacci with Head Recursion  : "+ new Fibonacci_Recusrion_Iteration().fibHead(5));
		System.out.println("Fibonacci with Tail Recursion  : "+ new Fibonacci_Recusrion_Iteration().fibTail(5,0,1));

		System.out.println("Fibonacci with Head Recursion  : "); new Fibonacci_Recusrion_Iteration().fibIteration((5));
	}
}
