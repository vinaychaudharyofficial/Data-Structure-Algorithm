package leetcode_problems_solutions_easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_Solution {

	public static void main(String[] args) {
		// TestCase1 nums = [2,7,11,15], target = 9
		// TestCase2 [3,2,4] 6
		int nums[] = new int[] { 3, 2, 4 };
		int target = 6;

		int resultArray[] = twoSumSolution1(nums, target);
		System.out.println("Indexes are : " + resultArray[0] + " , " + resultArray[1]);

	}

	//Time Complexity = O(n) and Space Comlexity = O(n) as we using HashMap to store approx n elements.
	//Runtime: 3 ms, faster than 79.66% of Java online submissions for Two Sum.
	//Memory Usage: 43.1 MB, less than 29.93% of Java online submissions for Two Sum.
	public int[] twoSumSolution2(int[] nums, int target) {
		Map futureMap = new HashMap<Integer,Integer>();
		int result[] = new int[2];
		for (int i = 0; i < nums.length; i++) {

			int ntf = target - nums[i];

			if (futureMap.get(ntf) != null) {
				result[0] = (Integer) futureMap.get(ntf);
				result[1] = i;
			} else {
				futureMap.put(nums[i], i);
			}

		}
		return result;
	}

	// Time Complexity = O(nlogn + n + n) which becomes O(nlogn)
	public static int[] twoSumSolution1(int[] nums, int target) {
		int pointer1 = 0;
		int pointer2 = nums.length - 1;
		int numTemp[] = nums.clone();
		Arrays.sort(nums); // O(nlogn)
		while (pointer1 < pointer2) { // O(n)
			if ((nums[pointer1] + nums[pointer2]) == target) {
				break;
			} else if ((nums[pointer1] + nums[pointer2]) > target) {
				pointer2--;
			} else if ((nums[pointer1] + nums[pointer2]) < target) {
				pointer1++;
			}
		}
		// System.out.println(pointer1 + " -- " + pointer2);
		int aa[] = new int[] { -1, -1 };
		for (int i = 0; i < numTemp.length; i++) { // O(n)
			if (nums[pointer1] == numTemp[i] && aa[0] == -1) {
				aa[0] = i;
			}
			if (nums[pointer2] == numTemp[i] && aa[0] != i && aa[1] == -1) {
				aa[1] = i;
			}
		}
		return aa;
	}

}
