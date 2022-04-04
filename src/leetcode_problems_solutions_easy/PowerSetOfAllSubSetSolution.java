package leetcode_problems_solutions_easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
---------------Question--------------------
Given an integer array nums of unique elements, return all possible subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

Example 1:
Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

Example 2:
Input: nums = [0]
Output: [[],[0]]

Constraints:
1 <= nums.length <= 10
-10 <= nums[i] <= 10
All the numbers of nums are unique.
 */

public class PowerSetOfAllSubSetSolution {
	int nums[] = {1,2,3};
    List<List<Integer>> resultUsingRecursion = new ArrayList<List<Integer>>();
    List<List<Integer>> resultUsingIteration = new ArrayList<List<Integer>>();

	public static void main(String[] args) {
		new PowerSetOfAllSubSetSolution().getPowerSet();
	}
    
    public void getPowerSet(){
    	 new PowerSetOfAllSubSetSolution().solveSubsetRecursionTreeMethod(nums,new ArrayList<Integer>(), resultUsingRecursion);
    	 new PowerSetOfAllSubSetSolution().solveSubsetIterativeMethod(nums,resultUsingIteration);
    	 System.out.println("ResultUsingRecursion : "+resultUsingRecursion);
    	 System.out.println("ResultUsingIteration : "+resultUsingIteration);

    }
    
    public void solveSubsetRecursionTreeMethod(int []nums, List<Integer> outputList, List<List<Integer>> result) {
    	if(nums.length == 0) {
    		result.add(outputList);
    		return;
    	}
    	List<Integer> op1 = new ArrayList<Integer>(outputList);
    	List<Integer> op2  = new ArrayList<Integer>(outputList);
    	op2.add(nums[0]);
    	nums=Arrays.copyOfRange(nums,1,nums.length);
    	solveSubsetRecursionTreeMethod(nums, op1, result);
    	solveSubsetRecursionTreeMethod(nums, op2, result);
    }
    
    public List<List<Integer>> solveSubsetIterativeMethod(int[] nums,List<List<Integer>> result) {
        result.add(new ArrayList<Integer>());
        for (int i=0;i<nums.length;i++){
            int size = result.size();
            for(int j=0;j<size;j++){
                List<Integer> r = new ArrayList<Integer>(result.get(j));
                r.add(nums[i]);
                result.add(r);
            }
        }
        return result;
    }
    
   /* public List<List<Integer>> subsetUsingRecursion(int num,int i, List<List<Integer>> result){
    	if(i == nums.length) {
    		result.add(new ArrayList<Integer>());
    		List l =new ArrayList<Integer>();
    		l.add(num);
    		result.add(l);
    		return result;
    	}
    	subsetUsingRecursion(nums[i],i+1, result);
    	for(int j=0;j<result.size();j++) {
    		List<Integer> temp = new ArrayList<Integer>(result.get(j));
    		temp.add(num);
    		result.add(temp);
    	}
    	return result;
    }*/
}
