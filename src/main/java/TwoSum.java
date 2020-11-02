import java.util.HashMap;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 * <p>
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        if (nums.length <= 0) return nums;
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        int find;
        for (int i = 0; i < nums.length; i++) {
            find = target - nums[i];
            if (!map.containsKey(find)) {
                map.put(nums[i], i);
            }else {
                result = new int[]{map.get(find), i};
            }
        }
        return result;
    }
}
