package arrays;

//Problem: Two Sum
//Link: https://leetcode.com/problems/two-sum/

public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] {};
	}

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		int[] ans = twoSum(nums, target);
		System.out.println(ans[0] + ", " + ans[1]);
	}
}
