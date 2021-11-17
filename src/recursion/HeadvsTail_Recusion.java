package recursion;()

public class HeadvsTail_Recusion {

	public void headRecusrion(int n) {
		System.out.println("(Storing this func call in stack) Calling head recusion for n= "+n);//debugger hits 6 times(5 to 0) here
		
		//base case to end recursion
		if(n==0) {
			return; //return means remove func call from stack
		}
		//recursive call
		headRecusrion(n-1);
		System.out.println("(Back tracking of recusion func in stack) Value of n= "+n);//debugger hit 5 time here (1 to 5)
	}
	public void tailRecusrion(int n) {
		System.out.println("(Storing this func call in stack) Calling tail recusion for n= "+n);//debugger hits 6 times(5 to 0) here
		
		//base case to end recursion
		if(n==0) {
			return;  //return means remove func call from stack
		}
		System.out.println("(No Back tracking of recusion func from stack tailRecursion("+n+") completed here) Value of n= "+n);//debugger hits 5 times(5 to 1)
		//recursive call
		tailRecusrion(n-1);
	}
	
	public static void main(String[] args) {
		new HeadvsTail_Recusion().tailRecusrion(5);
	}
}
