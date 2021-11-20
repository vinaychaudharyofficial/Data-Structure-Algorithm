package recursion;

public class Factorial_HeadTailRecursion_Iteration {

	public int fatorialTail(int n, int resultAccumulator) {
		
		if (n==1) return resultAccumulator;
		
		return fatorialTail(n-1, n*resultAccumulator);		
	}
	
	public int fatorialHead(int n) {
		
		if (n==1) return 1;
		
		int result= fatorialHead(n-1);
		return result*n;
		
	}
	
	public int factorialIteration(int n) {
		int result=1;
		for (int i=1;i<=n;i++) {
			result = i*result;
		}
		return result;
	}
	
	public static void main(String[] args) {
		//System.out.println("Factorial Head Recurion : "+ new Factorial_HeadTailRecursion_Iteration().fatorialHead(5));
		//System.out.println("Factorial Tail Recurion : "+ new Factorial_HeadTailRecursion_Iteration().fatorialTail(5,1));
		System.out.println("Factorial Iteration  : "+ new Factorial_HeadTailRecursion_Iteration().factorialIteration(5));
	}
}
