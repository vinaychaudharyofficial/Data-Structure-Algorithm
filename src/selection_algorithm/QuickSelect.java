package selection_algorithm;

import java.util.Random;

public class QuickSelect {

	int[] numarray;
	int leftIndeax;
	int rightIndeax;
	
	public QuickSelect(int[] numarray) {
		super();
		this.numarray = numarray;
	}
	
	void swap(int x,int y){
		int temp = numarray[x];
		numarray[x] = numarray[y];
		numarray[y] = temp;
	}
	
	int partition(int firstIndex, int lastIndex){
		int pivot = new Random().nextInt(lastIndex-firstIndex+1)+firstIndex;
		
		swap(pivot, lastIndex);
		for(int i=firstIndex;i<lastIndex;++i) {
			if(numarray[i]<numarray[lastIndex]) { // if numarray[i]>numarray[lastIndex] then it will give Kth largest element
				swap(i,firstIndex);
				firstIndex++;
			}
		}
		swap(firstIndex, lastIndex);
		return firstIndex;
	}
	
	int select(int k, int firstIndex, int lastIndex){
		int pivotIndex = partition(firstIndex, lastIndex);
		if (pivotIndex > k) {
			return select(k, firstIndex, pivotIndex-1);
		}else if (pivotIndex < k){
			return select(k,  pivotIndex+1, lastIndex);
		}
		return numarray[pivotIndex];
	}
	
	public static void main(String[] args) {
		int[] nums= {-1, 9, 6, -3, -10, 8, 12};
		int k=2;
		//below is k-1 means array start from 0 So if k=2 then 2nd largest would be at 1st index
		System.out.println(k+"th smallest elements is : "+new QuickSelect(nums).select(k-1, 0, nums.length-1)); 
		
	}
}
