package level1;

import java.util.ArrayList;

public class RunningSum1DArray {

	public static void main(String[] args) {

		int[] nums = { 3, 1, 2, 10, 1 };
		runningSum(nums);
	}

	public static int[] runningSum(int[] nums) {

		int[] runningSumArray = new int[nums.length];

		runningSumArray[0] = nums[0];

		int runValue = 0;
		for (int i = 1; i < nums.length; i++) {
			runningSumArray[i] = runningSumArray[i - 1] + nums[i];
		}

		return runningSumArray;
	}

}
